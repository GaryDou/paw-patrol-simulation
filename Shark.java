import java.util.Random;
/**
 * The shark class represents a shark object that extends the Predator class.
 * It inherits properties such as life status and the number of killing penguins from the Predator class.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class Shark extends Predator
{

    /**
     * Default constructor for creating a shark object.
     * It calls the default constructor of the superclass (LandPredator) using the 'super' keyword.
     */
    public Shark()
    {
        super();
    }

    /**
     * This constructor will create a shark object with custom properties.
     * It calls the parameterized constructor of the superclass (LandPredator) using the 'super' keyword
     * and initializes the shark object with the specified life status and the count of killing penguins
     * 
     * @param isAlive            The life status of the shark object (true if alive, false otherwise).
     * @param killPenguinCount   This integer of the shark object will count the number of penguins killed.
     */
    public Shark(boolean isAlive,int killPenguinCount)
    {
        super(isAlive,killPenguinCount);
    }

    /**
     * This method checks if a penguin is eaten based on the probability.
     * @return The eaten result of the shark object (true if eaten, false otherwise).
     */
    public boolean isEatenPenguin()
    {
        Random rand = new Random();
        int randomHatchNumber = rand.nextInt(1000) + 1;
        if(randomHatchNumber <= 2)
        {
            killPenguinCount++;
            return true;
        }
        return false;
    }
    
    /**
     * Overrides the toString() method to provide a string representation of the shark object.
     * 
     * @return a string representation of the shark object including its life status, the count of killing penguins.
     */
    @Override    
    public String toString()
    {
        return "Shark [ life status: " + getIsAlive() + " ,Number of killing penguin: " + getKillPenguinCount() + " ]";
    }

    // public static void main(String args[])
    // {
    //     Shark shark = new Shark();
    //     System.out.println(shark.toString());
    // }
}
