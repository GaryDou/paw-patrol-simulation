import java.util.Random;
/**
 * The cat class represents a cat object that extends the LandPredator class.
 * It inherits properties such as age, life status, eaten status, and counted status from the LandPredator class.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class Cat extends LandPredator
{

    /**
     * Default constructor for creating a cat object.
     * It calls the default constructor of the superclass (LandPredator) using the 'super' keyword.
     */
    public Cat()
    {
        super();
    }

    /**
     * This constructor will create a cat object with custom properties.
     * It calls the parameterized constructor of the superclass (LandPredator) using the 'super' keyword
     * and initializes the cat object with the specified life status, the count of killing penguins, and the count of killing chicks.
     * 
     * @param isAlive            The life status of the cat object (true if alive, false otherwise).
     * @param killPenguinCount   This integer of the cat object will count the number of penguins killed.
     * @param killChickCount     This integer of the cat object will count the number of chicks killed.
     */
    public Cat(boolean isAlive,int killPenguinCount,int killChickCount)
    {
        super(isAlive,killChickCount,killChickCount);
    }

    /**
     * This method checks if a chick is eaten based on the probability and the number of dogs.
     * @param numberOfDogs   This integer will show the number of dogs, it should be 0, 1 or 2.
     * @return               The eaten result of the cat object (true if eaten, false otherwise).
     */
    public boolean isEatenChick(int numberOfDogs)
    {
        Random rand = new Random();
        int randomHatchNumber = rand.nextInt(1000) + 1;
        if((randomHatchNumber <= 40) && (numberOfDogs == 0))
        {
            killChickCount++;
            return true;
        }
        if((randomHatchNumber <= 10) && (numberOfDogs == 1))
        {
            killChickCount++;
            return true;
        }
        if((randomHatchNumber <= 4) && (numberOfDogs == 2))
        {
            killChickCount++;
            return true;
        }
        return false;
    }

    /**
     * This method checks if a penguin is eaten based on the probability and the number of dogs.
     * @param numberOfDogs   This integer will show the number of dogs, it should be 0, 1 or 2.
     * @return               The eaten result of the cat object (true if eaten, false otherwise).
     */
    public boolean isEatenPenguin(int numberOfDogs)
    {
        Random rand = new Random();
        // Different dog's number will effect the probability of whether a cat will eat the penguin.
        int randomHatchNumber = rand.nextInt(1000) + 1;
        if((randomHatchNumber <= 40) && (numberOfDogs == 0))
        {
            killPenguinCount++;
            return true;
        }
        if((randomHatchNumber <= 10) && (numberOfDogs == 1))
        {
            killPenguinCount++;
            return true;
        }
        if((randomHatchNumber <= 4) && (numberOfDogs == 2))
        {
            killPenguinCount++;
            return true;
        }
        return false;
    }

    /**
     * This method checks if a cat is killed based on the probability and the number of dogs.
     * @param numberOfDogs   This integer will show the number of dogs, it should be 0, 1 or 2.
     * @return               The killing result of the cat object (true if killed, false otherwise).
     */
    public boolean isKillByDog(int numberOfDogs)
    {
        Random rand = new Random();
        int randomHatchNumber = rand.nextInt(100) + 1;
        if((numberOfDogs == 1) && (randomHatchNumber <= 1))
        {
            return true;
        }
        else if((numberOfDogs == 2) && (randomHatchNumber <= 10))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Overrides the toString() method to provide a string representation of the cat object.
     * 
     * @return a string representation of the cat object including its life status, the count of killing penguins, and the count of killing chicks.
     */
    @Override
    public String toString()
    {
        return "Cat [ life status: " + getIsAlive() + ", Number of killing penguin: " + getKillPenguinCount() + ", Number of killing chick: " + getKillChickCount() + " ]";
    }
}
