/**
 * The Penguin class represents a specific type of animal that is a Penguin.
 * It extends the Animal class and includes additional information about the
 * one boolean value represents whether a Penguin is counted for Simulation summary.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class Penguin extends Animal
{
    // This additional field will help for counting the monthly simulating summary.
    private boolean isCounted;

    /**
     * Default constructor for the Penguin class.
     * It calls the default constructor of the superclass (Animal) using the 'super' keyword.
     * Initializes the penguin as alive and =set false for isCounted boolean field.
     */
    public Penguin()
    {
        super();
        isCounted = false;
    }

    /**
     * Parameterized constructor for the Penguin class.
     * Initializes the Penguin with the specified life status,age by month, eaten status and counted status.
     * It calls the parameterized constructor of the superclass (Animal) using the 'super' keyword
     * 
     * @param isAlive          The initial life status of the Penguin (true if alive, false if dead).
     * @param isCounted        The initial life status of the Penguin (true if not counted, false if counted).
     */
    public Penguin(boolean isAlive,boolean isCounted)
    {
        super(isAlive);
        this.isCounted = isCounted;
    }

    /**
     * Retrieves the current status of this object whether it is counted before.
     * 
     * @return true if this object already counted,false otherwise.
     */
    public boolean getIsCounted()
    {
        return isCounted;
    }

    /**
     * Sets the status of this object by a boolean value.
     * 
     * @param isCounted The status update of this object.
     */
    protected void setIsCounted(boolean isCounted)
    {
        this.isCounted = isCounted;
    }

    /**
     * Overrides the toString() method to provide a string representation of the Penguin object.
     * 
     * @return a string representation of the Penguin object including its life status and counted status.
     */
    @Override
    public String toString()
    {
        return "Penguin [ life status: " + getIsAlive() + ", isCounted: " + getIsCounted() + " ]";
    }
}
