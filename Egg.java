/**
 * The Egg class represents an egg object that extends the Cub class.
 * It inherits properties such as age, life status, eaten status, and counted status from the Cub class.
 * This class provides constructors to create an Egg object with default or custom properties,
 * and it overrides the toString() method to provide a string representation of the Egg object.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class Egg extends Cub
{
    /**
     * Default constructor for creating an Egg object.
     * It calls the default constructor of the superclass (Cub) using the 'super' keyword.
     */
    public Egg()
    {
        super();
    }

    /**
     * Parameterized constructor for creating an Egg object with custom properties.
     * It calls the parameterized constructor of the superclass (Cub) using the 'super' keyword
     * and initializes the Egg object with the specified age, life status, eaten status, and counted status.
     * 
     * @param age       The age of the egg, the unit is month.
     * @param isAlive   The life status of the Egg object (true if alive, false otherwise).
     * @param isEaten   The eaten status of the Egg object (true if eaten, false otherwise).
     * @param isCounted The counted status of the Egg object (true if counted, false otherwise).
     */
    public Egg(int age,boolean isAlive, boolean isEaten,boolean isCounted)
    {
        super(isAlive,age,isEaten,isCounted);
    }
    
    /**
     * Overrides the toString() method to provide a string representation of the Egg object.
     * 
     * @return a string representation of the Egg object including its life status, age, eaten status, and counted status.
     */
    @Override
    public String toString() 
    {
        return "Egg [ life status: " + getIsAlive() + ", age: " + getAge() + ", eaten or not: " + getIsEaten() +  ", counted or not: " + getIsCounted() +  " ]";
    }
}
