import java.util.Random;
/**
 * The fox class represents a fox object that extends the LandPredator class.
 * It inherits properties such as age, life status, eaten status, and counted status from the LandPredator class.
 * It also have the uniqure field called killEggCount which is an integer for Fox object.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class Fox extends LandPredator
{
    private int killEggCount;

    /**
     * Default constructor for creating a fox object.
     * It calls the default constructor of the superclass (LandPredator) using the 'super' keyword.
     * It also set the number of field killEggCount to 0 for the default.
     */
    public Fox()
    {
        super();
        killEggCount = 0;
    }

    /**
     * This constructor will create a fox object with custom properties.
     * It calls the parameterized constructor of the superclass (LandPredator) using the 'super' keyword
     * and initializes the fox object with the specified life status, the count of killing penguins, and the count of killing chicks.
     * 
     * @param isAlive            The life status of the fox object (true if alive, false otherwise).
     * @param killPenguinCount   This integer of the fox object will count the number of penguins killed.
     * @param killChickCount     This integer of the fox object will count the number of chicks killed.
     * @param killEggCount       This integer of the fox object will count the number of eggs killed.
     */
    public Fox(boolean isAlive,int killPenguinCount,int killChickCount,int killEggCount)
    {
        super(isAlive,killPenguinCount,killChickCount);
        this.killEggCount = killEggCount;
    }

    /**
     * This method returns the current count of killed eggs.
     * @return the current count of killed eggs.
     */
    public int getKillEggCount()
    {
        return killEggCount;
    }

    /**
     * This method checks if a chick is eaten based on the probability and the number of dogs.
     * @param numberOfDogs   This integer will show the number of dogs, it should be 0, 1 or 2.
     * @return               The eaten result of the fox object (true if eaten, false otherwise).
     */
    public boolean isEatenChick(int numberOfDogs)
    {
        Random rand = new Random();
        int randomHatchNumber = rand.nextInt(1000) + 1;
        if((randomHatchNumber <= 80) && (numberOfDogs == 0))
        {
            killChickCount++;
            return true;
        }
        if((randomHatchNumber <= 20) && (numberOfDogs == 1))
        {
            killChickCount++;
            return true;
        }
        if((randomHatchNumber <= 8) && (numberOfDogs == 2))
        {
            killChickCount++;
            return true;
        }
        return false;
    }

    /**
     * This method checks if an egg is eaten based on the probability and the number of dogs.
     * @param numberOfDogs   This integer will show the number of dogs, it should be 0, 1 or 2.
     * @return               The eaten result of the fox object (true if eaten, false otherwise).
     */
    public boolean isEatenEgg(int numberOfDogs)
    {
        Random rand = new Random();
        int randomHatchNumber = rand.nextInt(1000) + 1;
        if((randomHatchNumber <= 40) && (numberOfDogs == 0))
        {
            killEggCount++;
            return true;
        }
        if((randomHatchNumber <= 10) && (numberOfDogs == 1))
        {
            killEggCount++;
            return true;
        }
        if((randomHatchNumber <= 4) && (numberOfDogs == 2))
        {
            killEggCount++;
            return true;
        }
        return false;
    }

    /**
     * This method checks if a penguin is eaten based on the probability and the number of dogs.
     * @param numberOfDogs   This integer will show the number of dogs, it should be 0, 1 or 2.
     * @return               The eaten result of the fox object (true if eaten, false otherwise).
     */
    public boolean isEatenPenguin(int numberOfDogs)
    {
        Random rand = new Random();
        int randomHatchNumber = rand.nextInt(1000) + 1;
        if((randomHatchNumber <= 80) && (numberOfDogs == 0))
        {
            killPenguinCount++;
            return true;
        }
        if((randomHatchNumber <= 20) && (numberOfDogs == 1))
        {
            killPenguinCount++;
            return true;
        }
        if((randomHatchNumber <= 8) && (numberOfDogs == 2))
        {
            killPenguinCount++;
            return true;
        }
        return false;
    }

    /**
     * This method checks if a fox is killed by the the dog(s) based on the probability and the number of dogs.
     * @param numberOfDogs   This integer will show the number of dogs, it should be 0, 1 or 2.
     * @return               The killing result of the fox object (true if killed, false otherwise).
     */
    public boolean isKillByDog(int numberOfDogs)
    {
        Random rand = new Random();
        int randomHatchNumber = rand.nextInt(100) + 1;
        if(numberOfDogs == 1 && randomHatchNumber <= 1)
        {
            return true;
        }
        else if(numberOfDogs == 2 && randomHatchNumber <= 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * This method will set the integer value of the count of kill eggs base on the provided parameter, 
     * and it also have a simple validation to make sure the integer will not the negative value.
     * @param killEggCount   This integer of the number of killed eggs.
     */
    public void setKillEggCount(int killEggCount)
    {
        if(killEggCount >= 0)
        {
            this.killEggCount = killEggCount;
        }
        else
        {
            System.out.println("Error: setter failed. The killEggCount cannot be negative.");
        }
    }

    /**
     * Overrides the toString() method to provide a string representation of the fox object.
     * 
     * @return a string representation of the fox object including its life status, the count of killing penguins, the count of killing chicks,
     * and the count of killing chick.
     */
    @Override
    public String toString()
    {
        return "Fox [ life status: " + getIsAlive() + ", Number of killing penguin: " + getKillPenguinCount() + ", Number of killing chick: " + getKillChickCount() + ", Number of killing egg: " + killEggCount + " ]";
    }
}
