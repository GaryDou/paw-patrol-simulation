import java.util.*;
import java.io.*;
/**
 * This class demonstrates the manage of the whole simulation program.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */  
public class PenguinPawPatrol
{
    private ArrayList<Fox> foxArrayList;
    private ArrayList<Shark> sharkArrayList;
    private ArrayList<Cat> catArrayList;
    private ArrayList<PenguinFamily> penguinFamilyNumberArrayList;
    private int numberOfDogs;

    /**
     * Default constructor for the PenguinPawPatrol class.
     * Initializes empty arraylists for foxes, sharks, cats, and penguin families, and sets the
     * number of dogs to -1 to indicate an unspecified value.
     */
    public PenguinPawPatrol() 
    {
        foxArrayList = new ArrayList<Fox>();
        sharkArrayList = new ArrayList<Shark>();
        catArrayList = new ArrayList<Cat>();
        penguinFamilyNumberArrayList = new ArrayList<PenguinFamily>();
        numberOfDogs = -1;
    }

    /**
     * Parameterized constructor for the PenguinPawPatrol class.
     * Initializes the paw patrol with the provided lists of foxes, sharks, cats, penguin families,
     * and the specified number of dogs.
     * 
     * @param foxArrayList                 List of Fox objects in the paw patrol.
     * @param sharkArrayList               List of Shark objects in the paw patrol.
     * @param catArrayList                 List of Cat objects in the paw patrol.
     * @param penguinFamilyNumberArrayList List of PenguinFamily objects in the paw patrol.
     * @param numberOfDogs                 The number of dogs present in the paw patrol.
     */
    public PenguinPawPatrol(ArrayList<Fox> foxArrayList,ArrayList<Shark> sharkArrayList,ArrayList<Cat> catArrayList,
                            ArrayList<PenguinFamily> penguinFamilyNumberArrayList,int numberOfDogs) 
    {
        this.foxArrayList = foxArrayList;
        this.sharkArrayList = sharkArrayList;
        this.catArrayList = catArrayList;
        this.penguinFamilyNumberArrayList = penguinFamilyNumberArrayList;
        this.numberOfDogs = numberOfDogs;
    }

    /**
     * This method will add the cat object into catList by the provided parameter.
     * @param number the number of add objects.
     */
    public void addCatNumber(int number) 
    {
        if (number > 0)
        {
            for(int i = 0; i < number; i++)
            {
                Cat cat = new Cat();
                catArrayList.add(cat);
            }
        }
        else
        {
            System.out.println("Error! The number should be larger than 0.");
        }

    }

    /**
     * This method will add the fox object into foxList by the provided parameter.
     * @param number the number of add objects.
     */
    public void addFoxNumber(int number) 
    {
        if (number > 0)
        {
            for(int i = 0; i < number; i++)
            {
                Fox fox = new Fox();
                foxArrayList.add(fox);
            }
        }
        else
        {
            System.out.println("Error! The number should be larger than 0.");
        }

    }

    /**
     * This method will add the PenguinFamily object into PenguinFamilyList by the provided parameter.
     * @param number the number of add objects.
     */
    public void addPenguinFamilyNumber(int number) 
    {
        if (number > 0)
        {
            for(int i = 0; i < number; i++)
            {
                PenguinFamily penguinFamily = new PenguinFamily();
                penguinFamilyNumberArrayList.add(penguinFamily);
            }
        }
        else
        {
            System.out.println("Error! The number should be larger than 0.");
        }
    }

    /**
     * This method will add the Shark object into SharkList by the provided parameter.
     * @param number the number of add objects.
     */
    public void addSharkNumber(int number) 
    {
        if (number > 0)
        {
            for(int i = 0; i < number; i++)
            {
                Shark shark = new Shark();
                sharkArrayList.add(shark);
            }
        }
        else
        {
            System.out.println("Error! The number should be larger than 0.");
        }
    }    

    /**
     * This method will change all the chicks and eggs' life status to false if there parents already dead.
     */
    public void cleanNoParents()
    {
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            Penguin female = penguinFamily.getPenguinFemale();
            Penguin male = penguinFamily.getPenguinMale();
            if (!female.getIsAlive() && !male.getIsAlive())
            {
                for(Egg egg : penguinFamily.getEggsList())
                {
                    egg.setIsAlive(false);
                }
                for(Chick chick : penguinFamily.getChickList())
                {
                    chick.setIsAlive(false);
                }
            }
        }
    }

    /**
     * This method will display this class's summary.
     */
    public void display()
    {
        System.out.println("FoxArrayList: " + getFoxArrayList());
        System.out.println("SharkArrayList: " + getSharkArrayList());
        System.out.println("CatArrayList:"  + getCatArrayList());
        System.out.println("PenguinFamilyNumberArrayList: " + getPenguinFamilyNumberArrayList());
        System.out.println("Number of dogs: " + getNumberOfDogs());       
    }
    /**
     * This method will dispaly the welcome message.
     */
    public void displayWelcomeMessage()
    {
        System.out.println("Welcome to the Paw Patrol!");
        System.out.println("===========================");
    }

    /**
     * Simulates penguin members of the paw patrol being eaten by cats.
     * The method iterates through each penguin family and cat in the paw patrol,
     * checks if the cat can eat any penguins or chicks, and updates their life status accordingly.
     * If a cat successfully eats a penguin or chick, their life status is set to dead.
     */
    public void eatenByCat()
    {
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            for(Cat cat : catArrayList) //eaten by cat
            {
                Penguin female = penguinFamily.getPenguinFemale();
                Penguin male = penguinFamily.getPenguinMale();
                if(cat.getIsAlive())
                {
                    if (female.getIsAlive())
                    {
                        if(cat.isEatenPenguin(getNumberOfDogs())) // Assuming the first one is female
                        {
                            female.setIsAlive(false);
                        }
                    }
                    else if (male.getIsAlive())
                    {
                        if (cat.isEatenPenguin(getNumberOfDogs()))// Assuming the second one is male
                        {
                            male.setIsAlive(false);
                        }
                    }
                    for(Chick chick : penguinFamily.getChickList())
                    {
                        if (chick.getIsAlive() && cat.isEatenChick(getNumberOfDogs()))
                        {
                            chick.setIsAlive(false);
                            chick.setIsEaten(true);
                        }
                    }
                }
            }
        }
    }

    /**
     * Simulates penguin members of the paw patrol being eaten by foxes.
     * The method iterates through each penguin family and fox in the paw patrol,
     * checks if the fox can eat any penguins or chicks, and updates their life status accordingly.
     * If a fox successfully eats a penguin or chick or egg, their life status is set to dead.
     */
    public void eatenByFox()
    {
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            for(Fox fox : foxArrayList) //eaten by fox
            {
                Penguin female = penguinFamily.getPenguinFemale();
                Penguin male = penguinFamily.getPenguinMale();
                if (fox.getIsAlive())
                {
                    if (female.getIsAlive())
                    {
                        if(fox.isEatenPenguin(getNumberOfDogs())) // Assuming the first one is female
                        {
                            female.setIsAlive(false);
                        }
                    }
                    if (male.getIsAlive())
                    {
                        if (fox.isEatenPenguin(getNumberOfDogs()))// Assuming the second one is male
                        {
                            male.setIsAlive(false);
                        }
                    }
                    for(Chick chick : penguinFamily.getChickList())
                    {
                        if (chick.getIsAlive() && fox.isEatenChick(getNumberOfDogs()))
                        {
                            chick.setIsAlive(false);
                            chick.setIsEaten(true);
                        }
                    }
                    for(Egg egg : penguinFamily.getEggsList())
                    {
                        if (egg.getIsAlive() && fox.isEatenEgg(getNumberOfDogs()))
                        {
                            egg.setIsAlive(false);
                            egg.setIsEaten(true);
                        }
                    }
                }
                else
                {
                    continue;
                }
            }
        }
    }

    /**
     * Simulates penguin members of the paw patrol being eaten by sharks.
     * The method iterates through each penguin family and shark in the paw patrol,
     * checks if the shark can eat any penguins or chicks, and updates their life status accordingly.
     * If a shark successfully eats a penguin, their life status is set to dead.
     */
    public void eatenByShark()
    {
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            for(Shark shark : sharkArrayList) //eaten by shark
            {
                Penguin female = penguinFamily.getPenguinFemale();
                Penguin male = penguinFamily.getPenguinMale();
                
                if (female.getIsAlive())
                {
                    if(shark.isEatenPenguin()) // Assuming the first one is female
                    {
                        female.setIsAlive(false);
                    }
                }
                else if (male.getIsAlive())
                {
                    if (shark.isEatenPenguin())// Assuming the second one is male
                    {
                        male.setIsAlive(false);
                    }
                }
            }
        }
    }

    /**
     * The method shows the end of simulation messages of the whole processing.
     * 
     */
    public void endOfSummary()
    {
        SimulationCounting simulationCounting = new SimulationCounting();
        System.out.println("End of simulation Summary: \n");
        System.out.println("Complete family: " + simulationCounting.countCompleteFamily(getPenguinFamilyNumberArrayList()));
        System.out.println("Live penguins: " +  simulationCounting.countPenguinAlive(getPenguinFamilyNumberArrayList()));
        System.out.println("Live chicks: " + simulationCounting.countLiveChick(getPenguinFamilyNumberArrayList()));
    }

    /**
     * This method will display the month name corresponding to the number.
     * @param month   The month number.
     * @return        The month name.
     */
    public String findMonthName(int month)
    {
        String message = " [ Error: Out of range ] ";
        String [] monthCollection = {"July","August","September","October","November","December","January","February",
                                        "March","April","May","June"};
        if((month >= 7) && (month <= 18))
        {
            for(int i = 0;i < monthCollection.length;i++)
            {
                int difference = month - 7;
                if(difference == i)
                {
                    return monthCollection[i];
                }
            }
        }
        return message;
    }

    /**
     * This method will demonstrates the summary monthly.
     */
    public void gartherMonthlySummary()
    {
        SimulationCounting simulationCounting = new SimulationCounting();
        System.out.println("    End of month colony status: ");
        System.out.println("    Complete family: " + simulationCounting.countCompleteFamily(getPenguinFamilyNumberArrayList()));
        System.out.println("    Live chick count: " + simulationCounting.countLiveChick(getPenguinFamilyNumberArrayList())); 
        System.out.println("    uneaten egg count: " + simulationCounting.countUneatenEgg(getPenguinFamilyNumberArrayList()));
        System.out.println("    fox count: " + simulationCounting.aliveFox(getFoxArrayList()));
        System.out.println("    cat count: " + simulationCounting.aliveCat(getCatArrayList()));
        System.out.println("    shark count: " + sharkArrayList.size() + "\n");   
    }

    /**
     * The method shows the list of cats in the paw patrol.
     *
     * @return ArrayList containing Cat objects representing the cats in the paw patrol.
     */
    public ArrayList<Cat> getCatArrayList() 
    {
        return catArrayList;
    }

    /**
     * Retrieves the list of foxes in the paw patrol.
     *
     * @return ArrayList containing Fox objects representing the foxes in the paw patrol.
     */
    public ArrayList<Fox> getFoxArrayList() 
    {
        return foxArrayList;
    }

    /**
     * Retrieves the number of dogs present in the paw patrol.
     *
     * @return The number of dogs in the paw patrol.
     */
    public int getNumberOfDogs()
    {
        return numberOfDogs;
    }

    /**
     * Retrieves the list of PenguinFamily in the paw patrol.
     *
     * @return ArrayList containing PenguinFamily objects representing the PenguinFamily in the paw patrol.
     */
    public ArrayList<PenguinFamily> getPenguinFamilyNumberArrayList()
    {
        return penguinFamilyNumberArrayList;
    }

    /**
     * Retrieves the list of sharks in the paw patrol.
     *
     * @return ArrayList containing Shark objects representing the sharks in the paw patrol.
     */
    public ArrayList<Shark> getSharkArrayList() 
    {
        return sharkArrayList;
    }

    /**
     * This method will prompt the user for input until they enter a valid keyword.
     * Uses the Validation class to validate user input and ensure it matches a specific keyword.
     * 
     * @return true if the user successfully inputs the valid keyword, false otherwise.
     */
    public boolean inputRequestKeywords()
    {
        Validation validation = new Validation();
        Input input = new Input();
        String userInput = "0";
        do
        {
            try
            {
                userInput = input.accptStringInput("\nPress ENTER to continue");
                if (!validation.isKeyWord(userInput)) 
                {
                    System.out.print("Your input is not valid! Press ENTER to continue\nTips: Enter bottom on the keyboard\n");
                }
            }
            catch(Exception e)
            {
                System.out.print("Error");
            }
        }while(!validation.isKeyWord(userInput));
        return true;

    }

    /**
     * This method will prompt the user for input until they enter a number that in the range.
     * Uses the Validation class to validate user input and ensure the input fit all the requirement.
     * 
     */
    public void inputRequstNumber()
    {
        Input input = new Input();
        Validation validation = new Validation();
        int count = 0;
        String userSelection = "";
        do
        {
            if (count > 0)
            {
                if ((userSelection.length() != 1) || (userSelection.isBlank()))
                {
                    System.out.println("Error: the length of your enter should be one");
                }
                else
                {
                    char inputChar = userSelection.charAt(0);
                    if ((inputChar < '0') || (inputChar > '9'))
                    {
                        System.out.println("Error: your enter is not a number\nYour enter : " + userSelection);
                    }
                }         
            }
            count++;
            userSelection = input.accptStringInput("How many patrol dogs? (0 to 2)");
        }while (!validation.isCorrectRangeNumber(userSelection));
        int number = Integer.parseInt(userSelection);
        setNumberOfDogs(number);
    }


    /**
     * This is the main method for running the whole program.
     * @throws FileNotFoundException If happens when the method cannot find out the specified file.
     * @throws IOException It appears when reading the file and an I/O error happens
     */
    public static void main(String[] args)
        throws FileNotFoundException, IOException
    {
        PenguinPawPatrol user = new PenguinPawPatrol();
        user.startProgram();
    }

    /**
     * This method will read the content from FileIO class and fill the empty arraylist in this class.
     * It should get a double array and extract the number to add the specific numbers of object.
     * @throws FileNotFoundException If happens when the method cannot find out the specified file.
     * @throws IOException It appears when reading the file and an I/O error happens
     */
    public void readFile()
        throws FileNotFoundException, IOException
    {
        FileIO extract = new FileIO();
        String animalNumber = extract.readfile();
        
        int penguin = 0;
        int fox = 0;
        int shark = 0;
        int cat = 0;
        try
        {
            String[] NumberContent = animalNumber.split(",");
            penguin = Integer.parseInt(NumberContent[0].trim());
            fox = Integer.parseInt(NumberContent[1].trim());
            cat = Integer.parseInt(NumberContent[2].trim());
            shark = Integer.parseInt(NumberContent[3].trim());
        }
        catch(Exception e)
        {
            System.out.println("Error!");
        }
        addFoxNumber(fox);
        addCatNumber(cat);
        addSharkNumber(shark); 
        addPenguinFamilyNumber(penguin);  
    }

    /**
     * This method will recieve the rating from the SimulationCounting class and display the message.
     */
    public void releaseFinalReport()
    {
        SimulationCounting simulationCounting = new SimulationCounting();
        double[] finalReport = simulationCounting.simulatingFinalReport(getPenguinFamilyNumberArrayList());
        System.out.print("\nColony survival rate: \n");
        System.out.printf("  *Family group survival rate: %.2f%%\n",finalReport[0]);
        System.out.printf("  *Penguin survival rate: %.2f%%\n",finalReport[1]);
        System.out.printf("  *Egg survival rate: %.2f%%\n",finalReport[2]);
        System.out.printf("  *Chick survival rate: %.2f%%\n",finalReport[3]);
        System.out.printf("  *Overall colony survival: %.2f\n",finalReport[4]);
    }

    /**
     * Sets the list of cats in the paw patrol to the provided ArrayList.
     *
     * @param catArrayList ArrayList containing cat objects representing the new cats in the paw patrol.
     */
    public void setCatArrayList(ArrayList<Cat> catArrayList) 
    {
        this.catArrayList = catArrayList;
    }

    /**
     * Sets the list of foxes in the paw patrol to the provided ArrayList.
     *
     * @param foxArrayList ArrayList containing Fox objects representing the new foxes in the paw patrol.
     */
    public void setFoxArrayList(ArrayList<Fox> foxArrayList) 
    {
        this.foxArrayList = foxArrayList;
    }

    /**
     * Sets the number of dogs in the paw patrol to the provided value.
     *
     * @param numberOfDogs The new number of dogs in the paw patrol.
     */
    public void setNumberOfDogs(int numberOfDogs)
    {
        if((numberOfDogs >= 0) && (numberOfDogs <= 2))
        {
            this.numberOfDogs = numberOfDogs;
        }
        else
        {
            System.out.println("Error! The dogs' number is out of range!");
        }
    }

    /**
     * Sets the list of PenguinFamily in the paw patrol to the provided ArrayList.
     *
     * @param penguinFamilyNumberArrayList ArrayList containing PenguinFamily objects representing the new PenguinFamily in the paw patrol.
     */
    public void setPenguinFamilyNumberArrayList(ArrayList<PenguinFamily> penguinFamilyNumberArrayList) 
    {
        this.penguinFamilyNumberArrayList = penguinFamilyNumberArrayList;
    }

    /**
     * Sets the list of sharks in the paw patrol to the provided ArrayList.
     *
     * @param sharkArrayList ArrayList containing Shark objects representing the new sharks in the paw patrol.
     */
    public void setSharkArrayList(ArrayList<Shark> sharkArrayList) 
    {
        this.sharkArrayList = sharkArrayList;
    }

    /**
     * This method will control the flow of the whole simulation.
     * @throws FileNotFoundException If happens when the method cannot find out the specified file.
     * @throws IOException It appears when reading the file and an I/O error happens
     */
    public void startProgram()
        throws FileNotFoundException, IOException
    {
        int count = 7;
        Scanner scanner = new Scanner(System.in);
        SimulationCounting simulationCounting = new SimulationCounting();
        startSummary();
        boolean isContinue = false;
        do
        {
            
            System.out.println("simulating month: " + findMonthName(count));
            if(count == 7)
            {
                readFile();
            }
            simulationMonthly(count);       
            gartherMonthlySummary();
            if(count == 18)
            {
                endOfSummary();
            }
            count++;;
            isContinue = inputRequestKeywords();
        

        }while((count < 19) && (isContinue == true));
        System.out.println("Simulating is done!");
        releaseFinalReport();
        
        writeFile(simulationCounting.simulatingFinalReport(getPenguinFamilyNumberArrayList()));
    }

    /**
     * This method will manage the monthly simulation and give difference action base on the provided parameter.
     * @param currentMonthCode  The number will effect the hatch egg action.
     */
    public void simulationMonthly(int currentMonthCode)
    {
        SimulationCounting simulationCounting = new SimulationCounting();
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            penguinFamily.AddOneAge();
            if((currentMonthCode < 8) || (currentMonthCode > 14))    //no new egg
            {
                penguinFamily.hatchEgg();
            }
            else //have new egg
            {
                penguinFamily.addEgg(penguinFamily.layEggsNumber());
                penguinFamily.hatchEgg();
            }
        }       
        eatenByCat();
        eatenByFox();
        eatenByShark();
        cleanNoParents();
        int[] penguinKill = simulationCounting.countPenguinKill(getPenguinFamilyNumberArrayList());
        // for test only
        // for (PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        // {
        //     penguinFamily.display();
        // }
        System.out.println("  + new chick: " + simulationCounting.countNewChick(getPenguinFamilyNumberArrayList()));
        System.out.println("  + new eggs: " + simulationCounting.countNewEgg(getPenguinFamilyNumberArrayList()));
        System.out.println("  - Penguin killed: " + penguinKill[0] + " male, " + penguinKill[1] + " female");
        System.out.println("  - Chicks killed: " + simulationCounting.countChickEaten(getPenguinFamilyNumberArrayList()));
        System.out.println("  - eggs eaten: " + simulationCounting.countEggEaten(getPenguinFamilyNumberArrayList())); 
        System.out.println("  - fox killed: " + simulationCounting.dogKillFox(getFoxArrayList(),getNumberOfDogs())); 
        System.out.println("  - cat killed: " + simulationCounting.dogKillCat(getCatArrayList(),getNumberOfDogs())); 
    }

    /**
     * This method will display a simple summary.
     */
    public void startSummary()
    {
        displayWelcomeMessage();
        inputRequstNumber();
        int realStartMonth = 7;
        System.out.println("Running simulation from month " + findMonthName(realStartMonth) + " to " + findMonthName(realStartMonth+11));
        System.out.println("Number of dogs: " + getNumberOfDogs());
    }

    /**
     * This method will charge for write the result to the new file it will call FileIO class for further action.
     * @param fileContent This double array will contain the simulation results.
     * @throws FileNotFoundException If happens when the method cannot find out the specified file.
     * @throws IOException It appears when reading the file and an I/O error happens
     */
    public void writeFile(double[] fileContent)
        throws FileNotFoundException, IOException
    {
        String result = "";
        int count = (fileContent.length) - 1;
        try
        {
            for(double content : fileContent)
            {
                String convertToString = String.format("%.2f", content);
                if(count == 0)
                {
                    result = result + convertToString;
                }
                else
                {
                    result = result + convertToString + ",";
                }
                count--;
            }
        }
        catch(Exception e)
        {
            System.out.println("Error!");
        }
        FileIO writeIo = new FileIO();
        writeIo.writeToFile(result);
    }
}
