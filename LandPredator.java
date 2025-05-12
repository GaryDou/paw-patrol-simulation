/**
 * The LandPredator class represents a specific type of predator that is a land predator.
 * It extends the Predator class and includes additional information about the
 * number of chick the LandPredator has killed.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class LandPredator extends Predator
{
    /**
     * The integer field that count the killed penguin number of this predator
     */
    protected int killChickCount;

    /**
     * Default constructor for the LandPredator class.
     * It calls the default constructor of the superclass (Predator) using the 'super' keyword.
     * Initializes the LandPredator as alive and sets the killChickCount to 0.
     */
    public LandPredator()
    {
        super();
        killChickCount = 0;
    }

    /**
     * Parameterized constructor for the LandPredator class.
     * Initializes the LandPredator with the specified life status, killPenguinCount and killChickCount.
     * It calls the parameterized constructor of the superclass (Predator) using the 'super' keyword
     * 
     * @param isAlive          The initial life status of the LandPredator (true if alive, false if dead).
     * @param killPenguinCount The number of penguins killed by the LandPredator.
     * @param killChickCount   The number of chicks killed by the LandPredator.
     */
    public LandPredator(boolean isAlive,int killPenguinCount,int killChickCount)
    {
        super(isAlive,killPenguinCount);
        this.killChickCount = killChickCount;
    }

    /**
     * Retrieves the number of chick killed by the land predator.
     * 
     * @return The count of chick killed by the land predator.
     */
    protected int getKillChickCount()
    {
        return killChickCount;
    }

    /**
     * Sets the number of chicks killed by the land predator.
     * 
     * @param killChickCount The new count of chicks killed by the land predator.
     */
    protected void setKillChickCount(int killChickCount)
    {
        if(killChickCount >= 0)
        {
            this.killChickCount = killChickCount;
        }
        else
        {
             System.out.println("Error: setter failed. The killChickCount cannot be negative.");           
        }
        
    }

    /**
     * This method will return a summary of this class.
     * 
     * @return a string representation of the land predator object, indicating its life status,
     *         the number of penguins it has killed and the number of chicks it has killed.
     */
    public String toString()  
    {
        return "LandPredator [ life status: " + getIsAlive() + ", Number of killing penguin: " + getKillPenguinCount() + ", Number of killing chick: " + killChickCount + " ]";
    }
}
