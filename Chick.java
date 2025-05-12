/**
 * The Chick class represents an chick object that extends the Cub class.
 * It inherits properties such as age, life status, eaten status, and counted status from the Cub class.
 * This class provides constructors to create an chick object with default or custom properties,
 * and it overrides the toString() method to provide a string representation of the chick object.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class Chick extends Cub
{
    /**
     * Default constructor for creating a chick object.
     * It calls the default constructor of the superclass (Cub) using the 'super' keyword.
     */
    public Chick()
    {
        super();
    }

    /**
     * Parameterized constructor for creating a chick object with custom properties.
     * It calls the parameterized constructor of the superclass (Cub) using the 'super' keyword
     * and initializes the chick object with the specified age, life status, eaten status, and counted status.
     * 
     * @param age       The age of the chick, the unit is month.
     * @param isAlive   The life status of the chick object (true if alive, false otherwise).
     * @param isEaten   The eaten status of the chick object (true if eaten, false otherwise).
     * @param isCounted The counted status of the chick object (true if counted, false otherwise).
     */
    public Chick(int age, boolean isAlive,boolean isEaten,boolean isCounted)
    {
        super(isAlive,age,isEaten,isCounted);
        
    }
    
    /**
     * Overrides the toString() method to provide a string representation of the chick object.
     * 
     * @return a string representation of the chick object including its life status, age, eaten status, and counted status.
     */
    @Override
    public String toString() 
    {
        return "Chick [ life status: " + getIsAlive() + ", age: " + getAge() + ", eaten or not: " + getIsEaten() +  ", counted or not: " + getIsCounted() +  " ]";
    }
    
}
