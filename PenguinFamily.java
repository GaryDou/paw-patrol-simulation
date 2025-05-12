import java.util.ArrayList;
import java.util.Random;

/**
 * The PenguinFamily class will provide the details of a Penguin Family in the simulation includes different status of the animals for simulation.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class PenguinFamily
{

    private ArrayList <Chick> chickList;
    private ArrayList <Egg> eggsList;
    private Penguin penguinFemale;
    private Penguin penguinMale;
    private String pnnn;

    private static int pnnnNumber = 0;

    /**
     * Default constructor for the PenguinFamily class.
     * The pnnnNumber will increase one after a new object created.
     */
    public PenguinFamily()
    {
        pnnnNumber += 1;
        pnnn = generatePnnn();
        penguinMale = new Penguin();
        penguinFemale = new Penguin();
        chickList = new ArrayList<Chick> ();
        eggsList = new ArrayList<Egg> ();
    }

    /**
     * Constructor for the PenguinFamily class.
     * Initializes the penguin family with the provided parameters and increments the static pnnnNumber.
     * 
     * @param pnnn          The unique identifier of the penguin family.
     * @param penguinMale   The male penguin in the family.
     * @param penguinFemale The female penguin in the family.
     * @param eggsList      ArrayList containing Egg objects representing the eggs in the family.
     * @param chickList     ArrayList containing Chick objects representing the chicks in the family.
     */
    public PenguinFamily(String pnnn,
                         Penguin penguinMale,
                         Penguin penguinFemale,
                         ArrayList <Egg> eggsList,
                         ArrayList <Chick> chickList)
    {
        pnnnNumber += 1;
        if (pnnn == null || penguinMale == null || penguinFemale == null || eggsList == null || chickList == null) 
        {
            throw new IllegalArgumentException("Invalid input: Parameters cannot be null.");
        }
        this.pnnn = pnnn;
        this.penguinMale = penguinMale;
        this.penguinFemale = penguinFemale;
        this.chickList = chickList;
        this.eggsList = eggsList;
    }

    /**
     * This method will add a chick object into chickList.
     */
    public void addChick()
    {
        Chick chick = new Chick(0,true,false,false);
        chickList.add(chick);
    }

    /**
     * This method will add egg objects into chickList by provided numbers.
     * @param eggNumber  The number of eggs.
     */
    public void addEgg(int eggNumber)
    {
        if(eggNumber >= 0)
        {
            for(int i = 0; i < eggNumber;i++)
            {
                Egg egg = new Egg();
                eggsList.add(egg);
            }
        }
        else
        {
             System.out.println("Error: add failed. The number cannot be negative."); 
        }
    }

    /**
     * This method will add age for the field in this class.
     */
    public void AddOneAge()
    {
        for(Egg egg : eggsList)
        {
            if(egg.getIsAlive())
            {
                egg.addAge();
            }
        }     
        for(Chick chick : chickList)
        {
            if(chick.getIsAlive())
            {
                chick.addAge();
            }
        }      
    }

    /**
     * This method will change the life status of chicks by the number of chicks.
     * @param chickNumber the number of dead chicks.
     */
    public void changeToDeadChick(int chickNumber) 
    {
        int count = 0;
        for(Chick chick : chickList)
        {
            if(chick.getIsAlive() && count < chickNumber)
            {
                chick.setIsAlive(false);
                count++;
            }
        }
    }

    /**
     * This method will display a summary of the object.
     */
    public void display()
    {
        System.out.println("pnnn: " + getPnnn());
        System.out.println("penguinMale: " + getPenguinMale());
        System.out.println("penguinFemale: " + getPenguinFemale());
        System.out.println("chickList: " + getChickList());
        System.out.println("eggsList: " + getEggsList());
    }

    /**
     * This method will generate unique id of each PenguinFamily.
     * @return the Pnnn number in specified format
     */
    public String generatePnnn()
    {
        return String.format("P%03d", pnnnNumber);
    }

    /**
     * Get the list of chicks in the penguin family.
     *
     * @return ArrayList containing Chick objects representing the chicks in the family.
     */
    public ArrayList<Chick> getChickList()
    {
        return chickList;
    }

    /**
     * Get the list of eggs in the penguin family.
     *
     * @return ArrayList containing egg objects representing the eggs in the family.
     */
    public ArrayList<Egg> getEggsList()
    {
        return eggsList;
    }

    /**
     * Get the femalePenguin in the penguin family.
     *
     * @return containing penguin object representing the female.
     */
    public Penguin getPenguinFemale()
    {
        return penguinFemale;
    }

    /**
     * Get the malePenguin in the penguin family.
     *
     * @return containing penguin object representing the male.
     */
    public Penguin getPenguinMale()
    {
        return penguinMale;
    }

    /**
     * Get the pnnn in the penguin family.
     *
     * @return A string with pnnn.
     */
    public String getPnnn()
    {
        return pnnn;
    }


    /**
     * This method will hatch all the egg if this egg reach the requirement of hatching in the eggsList.
     *
     */
    public void hatchEgg()
    {
        if(!eggsList.isEmpty())
        {
            for(Egg egg : eggsList)
            {
                if(egg.getAge() == 1 && egg.getIsAlive())
                {
                    Random rand = new Random();
                    int randomHatchNumber = rand.nextInt(10) + 1;
                    if(randomHatchNumber < 8)
                    {
                        addChick();
                    }
                    egg.setIsAlive(false);
                }
            }
        }     
    }

    /**
     * This method will lay the new eggs.
     * @return The number of new eggs.
     */
    public int layEggsNumber()
    {
        Random rand = new Random();
        int eggNumber = 0;
        if((penguinFemale.getIsAlive() == true) && (penguinMale.getIsAlive() == true))
        {
            eggNumber = rand.nextInt(3);
        }
        return eggNumber; 
    }

    /**
     * Sets the list of chicks in the penguin family to the provided ArrayList.
     *
     * @param chickList ArrayList containing Chick objects representing the chicks in the family.
     */
    public void setChickList(ArrayList<Chick> chickList)
    {
        this.chickList = chickList;
    }

    /**
     * Sets the list of eggs in the penguin family to the provided ArrayList.
     *
     * @param eggsList ArrayList containing Egg objects representing the eggs in the family.
     */
    public void setEggsList(ArrayList<Egg> eggsList)
    {
        this.eggsList = eggsList;
    }

    /**
     * Sets the female penguin in the family to the provided Penguin object.
     *
     * @param penguinFemale The female Penguin object in the family.
     */
    public void setPenguinFemale(Penguin penguinFemale)
    {
        this.penguinFemale = penguinFemale;
    }

    /**
     * Sets the male penguin in the family to the provided Penguin object.
     *
     * @param penguinMale The male Penguin object in the family.
     */
    public void setPenguinMale(Penguin penguinMale)
    {
        this.penguinMale = penguinMale;
    }
    
    /**
     * Sets the pnnn in the family to the provided String.
     *
     * @param pnnn The new pnnn.
     */
    public void setPnnn(String pnnn)
    {
        if((pnnn != null) &&(pnnn.length() == 4) && (pnnn.charAt(0) == 'P'))
        {
            try
            {
                int first = Integer.parseInt(String.valueOf(pnnn.charAt(1)));
                int second = Integer.parseInt(String.valueOf(pnnn.charAt(2)));
                int third = Integer.parseInt(String.valueOf(pnnn.charAt(3)));
                this.pnnn = pnnn;
            }
            catch(Exception e)
            {
                System.out.println("Error: setter failed. The pnnn should be Pnnn, which nnn represents a sequence of 3 digits.");
            }
        }
        else
        {
            System.out.println("Error: setter failed. The pnnn should be Pnnn, which nnn represents a sequence of 3 digits .");
        }
    }

    // public static void main(String args[])
    // {
        // System.out.println("Test coding");

        // constructors
        // System.out.println("Create a penguinFamily object with the default constructor");
        // PenguinFamily emp1 = new PenguinFamily();
        // emp1.display();

        // System.out.println("Create a penguinFamily object with the non-default constructor with valid field values");
        // ArrayList<Chick> chickList = new ArrayList<Chick>();
        // ArrayList<Egg> eggsList = new ArrayList<Egg>();
        // Penguin malePenguin = new Penguin(true, false);
        // Penguin femalePenguin = new Penguin(true, false);
        // PenguinFamily emp2 = new PenguinFamily("P011", malePenguin, femalePenguin, eggsList, chickList);
        // emp2.display();

        // System.out.println("Create a penguinFamily object with the non-default constructor with invalid field values");
        // ArrayList<Chick> chickList = new ArrayList<Chick>();
        // ArrayList<Egg> eggsList = new ArrayList<Egg>();
        // Penguin malePenguin = new Penguin(true, false);
        // Penguin femalePenguin = new Penguin(true, false);
        // PenguinFamily emp3 = new PenguinFamily(null, malePenguin, femalePenguin, eggsList, chickList);
        // emp3.display(); 

        // getter method
        // System.out.println("test getChickList() with default constructor");
        // PenguinFamily emp4 = new PenguinFamily();
        // System.out.println(emp4.getChickList()); 

        // System.out.println("test getEggsList() with default constructor");
        // PenguinFamily emp5 = new PenguinFamily();
        // System.out.println(emp5.getEggsList()); 

        // System.out.println("test getPenguinFemale() with default constructor");
        // PenguinFamily emp6 = new PenguinFamily();
        // System.out.println(emp6.getPenguinFemale()); 

        // System.out.println("test getPenguinMale() with default constructor");
        // PenguinFamily emp7 = new PenguinFamily();
        // System.out.println(emp7.getPenguinMale()); 

        // System.out.println("test getPnnn() with default constructor");
        // PenguinFamily emp8 = new PenguinFamily();
        // System.out.println(emp8.getPnnn());   

        //setter method
        // System.out.println("test setChickList() with default constructor with valid input");
        // PenguinFamily emp9 = new PenguinFamily();
        // ArrayList<Chick> chickList = new ArrayList<>();
        // chickList.add(new Chick(1, true, true, true));
        // emp9.setChickList(chickList);
        // emp9.display(); 

        // System.out.println("test setEggsList() with default constructor with valid input");
        // PenguinFamily emp10 = new PenguinFamily();
        // ArrayList<Egg> eggsList = new ArrayList<>();
        // eggsList.add(new Egg(1, true, true, true));
        // emp10.setEggsList(eggsList);
        // emp10.display();

        // System.out.println("test setPenguinFemale() with valid input");
        // PenguinFamily emp11 = new PenguinFamily();
        // Penguin femalePenguin = new Penguin(true,true);
        // emp11.setPenguinFemale(femalePenguin);
        // emp11.display();

        // System.out.println("test setPenguinMale() with valid input");
        // PenguinFamily emp12 = new PenguinFamily();
        // Penguin MalePenguin = new Penguin(true,true);
        // emp12.setPenguinMale(MalePenguin);
        // emp12.display();

        // System.out.println("test setPnnn() with default constructor with valid input");
        // PenguinFamily emp13 = new PenguinFamily();
        // emp13.setPnnn("P100"); 
        // emp13.display();

        // System.out.println("test setPnnn() with default constructor with invalid input");
        // PenguinFamily emp14 = new PenguinFamily();
        // emp14.setPnnn("Pxxx"); 
        // emp14.display();

        //other method
        // System.out.println("test display() with default constructor");
        // PenguinFamily emp15 = new PenguinFamily();
        // emp15.display();

        // System.out.println("test layEggsNumber() with default constructor");
        // PenguinFamily emp16 = new PenguinFamily();
        // System.out.println(emp16.layEggsNumber());

        // System.out.println("test addEgg() with default constructor");
        // PenguinFamily emp17 = new PenguinFamily();
        // emp17.addEgg(2);
        // emp17.display();

        // System.out.println("test hatchEgg() with default constructor");
        // PenguinFamily emp18 = new PenguinFamily();
        // emp18.addEgg(2);
        // emp18.AddOneAge();
        // emp18.hatchEgg();
        // emp18.display();

        // System.out.println("test addChick() with default constructor");
        // PenguinFamily emp19 = new PenguinFamily();
        // emp19.addChick();
        // emp19.display();

        // System.out.println("test changeToDeadChick(int chickNumber) with default constructor");
        // PenguinFamily emp20 = new PenguinFamily();
        // emp20.addChick();
        // emp20.changeToDeadChick(1);
        // emp20.display();

        // System.out.println("test AddOneAge() with default constructor");
        // PenguinFamily emp21 = new PenguinFamily();
        // emp21.addChick();
        // emp21.addEgg(1);
        // emp21.AddOneAge();
        // emp21.display();

        // System.out.println("test generatePnnn() with default constructor");
        // PenguinFamily emp22 = new PenguinFamily();
        // PenguinFamily emp23 = new PenguinFamily();
        // emp22.generatePnnn();
        // emp23.generatePnnn();
        // emp22.display();
        // emp23.display();
    // }
}

