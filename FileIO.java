import java.io.*;
import java.util.*;

/**
 * The FileIO class provides methods for reading and writing files.
 * It contains functionality to read data from a file and write data to another file.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class FileIO
{
    private static final String FILE_NAME = "colony.txt";
    private static final String FINAL_FILE_NAME = "colonyFinal.txt";

    /**
     * Default constructor for the FileIO class.
     */
    public FileIO() 
    {
        
    }
    
    /**
     * Reads the content of the specified file and returns it as a string.
     * It has part of coding from applied09 by Tutor Peter Chen.
     * @throws FileNotFoundException If happens when the method cannot find out the specified file.
     * @throws IOException It appears when reading the file and an I/O error happens
     * @return The content of the file as a string.
     */
    public String readfile()
        throws FileNotFoundException, IOException 
    {
        FileReader reader = new FileReader(FILE_NAME); 
        Scanner scanner = new Scanner(reader);
        String animalNumber = "";
        try
        { 
            if (scanner.hasNextLine())
            {
                animalNumber = scanner.nextLine();
                reader.close();
            }
        }
        catch(Exception e)
        {
            System.out.println("Error! ");
        }
        finally
        {
            return animalNumber;
        }
    } 

    /**
     * Writes the specified content to an output file.
     * @param  fileContent The content to be written to the file.
     * @throws FileNotFoundException If happens when the method cannot find out the specified file.
     * @throws IOException It appears when reading the file and an I/O error happens
     */
    public void writeToFile(String fileContent)
        throws FileNotFoundException,IOException
    {
        PrintWriter writer = new PrintWriter(FINAL_FILE_NAME);
        writer.println(fileContent);
        writer.close();
    }
}
