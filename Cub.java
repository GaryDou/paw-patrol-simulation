/**
 * The Cub class represents a specific type of animal that is a Cub.
 * It extends the Animal class and includes additional information about the
 * the age of a cub, the two boolean values represent whether a cub is counted and eaten.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class Cub extends Animal
{
    /**
     * This is a integer field indicating the age of this object and the unit is month.
     */
    protected int age;
    /**
     * This additional boolean field will help for check the death reason when counting the summary.
     * it turns true if the object has been eaten, false otherwise
     */
    protected boolean isEaten;
    /**
     * This additional boolean field will help for counting the monthly simulating summary.
     * it turns true if the object has been counted, false otherwise
     */
    protected boolean isCounted;

    /**
     * Default constructor for the Cub class.
     * It calls the default constructor of the superclass (Animal) using the 'super' keyword.
     * Initializes the cub as alive and sets the age to 0, and set false for two boolean fields.
     */
    public Cub()
    {
        super();
        age = 0;
        isEaten = false;
        isCounted = false;
    }

    /**
     * Parameterized constructor for the Cub class.
     * Initializes the Cub with the specified life status,age by month, eaten status and counted status.
     * It calls the parameterized constructor of the superclass (Animal) using the 'super' keyword
     * 
     * @param isAlive          The initial life status of the Cub (true if alive, false if dead).
     * @param age              The age count by month unit of a cub.
     * @param isEaten          The eaten status of the Cub (true if not eaten , false if eaten).
     * @param isCounted        The initial life status of the Cub (true if not counted, false if counted).
     */
    public Cub(boolean isAlive,int age, boolean isEaten,boolean isCounted)
    {
        super(isAlive);
        this.age = age;
        this.isEaten = isEaten;
        this.isCounted = isCounted; 
    }

    /**
     *  This method will add the one month age of the object.
     * 
     */
    protected void addAge()
    {
        age++;
    }

    /**
     * This method will set the object status to false.
     * 
     */
    public void changeToDie()
    {
        setIsAlive(false);
    }

    /**
     * Retrieves the current age of this object and the scale unit is month.
     * 
     * @return The current age of this object.
     */
    protected int getAge()
    {
        return age;
    }

    /**
     * Retrieves the current status of this object whether it is counted before.
     * 
     * @return true if this object already counted,false otherwise.
     */
    protected boolean getIsCounted()
    {
        return isCounted;
    }

    /**
     * Retrieves the current status of this object whether it is eaten.
     * 
     * @return true if this object already eaten,false otherwise.
     */
    protected boolean getIsEaten()
    {
        return isEaten;
    }

    /**
     * Set the age value if new age can pass the simple validation and print a message if can't.
     * 
     * @param age The age number update of this object.
     */
    protected void setAge(int age)
    {
        if(age >= 0)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Error: setter failed. The age cannot be negative.");
        }
        
    }

    /**
     * Sets the status of this object by a boolean value.
     * 
     * @param isCounted the status update of this object.
     */
    protected void setIsCounted(boolean isCounted)
    {
        this.isCounted = isCounted;
    }

    /**
     * Sets the status of this object by a boolean value.
     * 
     * @param isEaten The status update of this object.
     */
    protected void setIsEaten(boolean isEaten)
    {
        this.isEaten = isEaten;
    }

    /**
     * Overrides the toString() method to provide a string representation of the Cub object.
     * 
     * @return a string representation of the Cub object including its life status, age, eaten status, and counted status.
     */
    @Override
    public String toString() 
    {
        return "Cub [ life status: " + getIsAlive() + ", age: " + age + ", eaten?: " + isEaten +  ", counted?: " + isCounted +  " ]";
    }
}
