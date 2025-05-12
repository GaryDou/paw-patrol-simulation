/**
 * The Animal class represents a basic animal entity with a life status.
 * This class serves as the parent class for more specific animal subclasses.
 * It contains methods to retrieve and modify the life status of the animal.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class Animal
{
    /**
    * This is a boolean field indicating whether the animal is alive or not.
    */
    protected boolean isAlive;

    /**
     * Default constructor initializes the isAlive variable to true, indicating the animal is alive.
     */
    public Animal()
    {
        isAlive = true;
    }

    /**
     * This constructor initializes the variable based on the provided value.
     * 
     * @param isAlive The initial life status of the animal (true if alive, false if dead).
     */
    public Animal(boolean isAlive)
    {
        this.isAlive = isAlive;
    }

    /**
     * Retrieves the current life status of the animal.
     * 
     * @return if the animal is alive,false otherwise.
     */
    protected boolean getIsAlive()
    {
        return isAlive;
    }   

    /**
     * Sets the life status of the animal to the specified value.
     * 
     * @param isAlive The new life status of the animal (true if alive, false if dead).
     */
    protected void setIsAlive(boolean isAlive)
    {
        this.isAlive = isAlive;
    }

    /**
     * Returns a string representation of the animal object, including its life status.
     * 
     * @return A string representation of the animal object, indicating its life status.
     */
    public String toString()
    {
        return "Animal [ life status: " + isAlive + " ]";
    }
}
