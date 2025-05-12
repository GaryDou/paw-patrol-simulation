/**
 * This class demonstrates the methods for user validation.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class Validation
{

    /**
     * This default Constructor for the Validation class.
     */    
    public Validation()
    {
        
    }

    /**
     * This method will check whether player input whether is 0, 1 or 2.
     * @param input The input to be validated.
     * @return true if the input is valid number and the correct length, false otherwise.
     */
    public boolean isCorrectRangeNumber(String input) 
    {
        if (input.length() == 1)
        {
            char inputChar = input.charAt(0);
            if ( '2' >= inputChar && inputChar >= '0')
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else 
        {
            return false;
        }
    }
    
    /**
     * This method will check whether player input whether contains the specific keywords.
     * @param input The input to be validated.
     * @return true if the input is enter, false otherwise.
     */
    public boolean isKeyWord(String input) 
    {
        if (input.equals(""))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
