/**
 * The Predator class represents a specific type of animal that is a predator.
 * It extends the Animal class and includes additional information about the
 * number of penguins the predator has killed.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class Predator extends Animal
{
    /**
     * The integer field that count the killed penguin number of this predator
     */
    protected int killPenguinCount;

    /**
     * Default constructor for the Predator class.
     * It calls the default constructor of the superclass (Animal) using the 'super' keyword.
     * Initializes the predator as alive and sets the killPenguinCount to 0.
     */
    public Predator()
    {
        super();
        killPenguinCount = 0;

    }

    /**
     * Parameterized constructor for the Predator class.
     * Initializes the predator with the specified life status and killPenguinCount.
     * It calls the parameterized constructor of the superclass (Animal) using the 'super' keyword
     * 
     * @param isAlive          The initial life status of the predator (true if alive, false if dead).
     * @param killPenguinCount The number of penguins killed by the predator.
     */
    public Predator(boolean isAlive, int killPenguinCount)
    {
        super(isAlive);
        this.killPenguinCount = killPenguinCount;

    }

    /**
     * Retrieves the number of penguins killed by the predator.
     * 
     * @return The count of penguins killed by the predator.
     */
    protected int getKillPenguinCount()
    {
        return killPenguinCount;
    }

    /**
     * Sets the number of penguins killed by the predator.
     * 
     * @param killPenguinCount The new count of penguins killed by the predator.
     */
    protected void setKillPenguinCount(int killPenguinCount)
    {
        if(killPenguinCount >= 0)
        {
            this.killPenguinCount = killPenguinCount;
        }
        else 
        {
            System.out.println("Error: setter failed. The killPenguinCount cannot be negative.");
        }
    }

    /**
     * This method will return a summary of this class.
     * 
     * @return A string representation of the predator object, indicating its life status
     *         and the number of penguins it has killed.
     */
    @Override
    public String toString()
    {
        return "Predator [ life status: " + getIsAlive() + "Number of killing penguin: " + killPenguinCount + " ]";
    }
}
