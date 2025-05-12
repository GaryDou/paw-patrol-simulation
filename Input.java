import java.util.Scanner;
/**
 * This class demonstrates the methods for receiving user input data.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class Input
{

    /**
     * Default constructor for creating Input object.
     */
    public Input()
    {
        
    }  

    /**
     * This method will accept the input in String.
     * @param input The input will be accepted.
     * @return inputString The player's input will return in String data type.
     */    
    public String accptStringInput(String input)
    {
        System.out.println(input);
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();   
        return inputString;    
    }

}
