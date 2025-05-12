import java.util.ArrayList;
/**
 * The SimulationCounting class will provide the counting methods for the main file PenguinPawPatrol.
 * @author Zhenyao Dou 
 * @version ver 1.0.0
 */
public class SimulationCounting
{

    /**
     * Default constructor for the SimulationCounting class.
     */    
    public SimulationCounting()
    {

    }

    /**
     * This method will count the number of alive cat in the provided arraylist.
     * @param catArrayList The arraylist will be have the object type as Cat class.
     * @return The number of alive cat.
     */  
    public int aliveCat(ArrayList<Cat> catArrayList)
    {   
        int countAlive = 0;
        for (Cat cat : catArrayList)
        {
            if(cat.getIsAlive())
            {
                countAlive++;
            }
        }
        return countAlive;
    }

    /**
     * This method will count the number of alive fox in the provided arraylist.
     * @param  foxArrayList  The arraylist will be have the object type as fox class.
     * @return               The number of alive fox.
     */  
    public int aliveFox(ArrayList<Fox> foxArrayList)
    {   
        int countAlive = 0;
        for (Fox fox : foxArrayList)
        {
            if(fox.getIsAlive())
            {
                countAlive++;
            }
        }
        return countAlive;
    }

    /**
     * This method will calculate the Survival Rate of chick by the formula after the simulation is done.
     * @param penguinFamilyNumberArrayList   An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The survival rate of chicks as a percentage (total_chicks_alive / total_chicks_hatched * 100).
     */ 
    public double chickSurvivalRate(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {
        int chickAlive = 0;
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            for(Chick chick : penguinFamily.getChickList())
            {
                if(chick.getIsAlive() == true)
                {
                    chickAlive++;
                }
            }
        }
        return chickAlive;
    }

    /**
     * This method will count the number of eaten chick in the provided arraylist.
     * @param  penguinFamilyNumberArrayList  An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The number of eaten chick.
     */ 
    public int countChickEaten(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {
        int countKill = 0;
        for (PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            for(Chick chick : penguinFamily.getChickList())
            {
                if((chick.getIsCounted() == false) && (chick.getIsAlive() == false))
                {
                    countKill++;
                    chick.setIsCounted(true);
                }
            }
        }
        return countKill;
    }

    /**
     * This method will count the number of complete Penguin Families in the provided arraylist.
     * @param  penguinFamilyNumberArrayList  An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The number of complete Penguin Families.
     */ 
    public int countCompleteFamily(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {   
        int countAlive = 0;
        for (PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            Penguin female = penguinFamily.getPenguinFemale();
            Penguin male = penguinFamily.getPenguinMale();
            if (female.getIsAlive() == true && male.getIsAlive() == true)
            {
                countAlive++;
            }

        }
        return countAlive;
    }    

    /**
     * This method will count the number of eaten eggs in the provided arraylist.
     * @param  penguinFamilyNumberArrayList  An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The number of eaten eggs.
     */ 
    public int countEggEaten(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {   
        int countEaten = 0;
        for (PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            for(Egg egg : penguinFamily.getEggsList())
            {
                if((egg.getIsCounted() == false) && (egg.getIsAlive() == false) && (egg.getIsEaten() == true))
                {
                    countEaten++;
                    egg.setIsCounted(true);
                }
            }
        }
        return countEaten;
    }  

    /**
     * This method will count the number of alive chicks in the provided arraylist.
     * @param  penguinFamilyNumberArrayList  An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The number of alive chicks.
     */ 
    public int countLiveChick(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {
        int countLive = 0;
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            for(Chick chick : penguinFamily.getChickList())
            {
                if(chick.getIsAlive())
                {
                    countLive++;
                }
            }
        }
        return countLive;
    }

    /**
     * This method will count the number of new chicks in the provided arraylist.
     * @param  penguinFamilyNumberArrayList  An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The number of new chicks.
     */ 
    public int countNewChick(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {
        int countLive = 0;
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            for(Chick chick : penguinFamily.getChickList())
            {
                if(chick.getIsAlive() && chick.getAge() == 0)
                {
                    countLive++;
                }
            }
        }
        return countLive;
    }

    /**
     * This method will count the number of new eggs in the provided arraylist.
     * @param  penguinFamilyNumberArrayList  An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The number of new eggs.
     */ 
    public int countNewEgg(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {
        int countLive = 0;
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            for(Egg egg : penguinFamily.getEggsList())
            {
                if(egg.getIsAlive() && egg.getAge() == 0)
                {
                    countLive++;
                }
            }
        }
        return countLive;
    }

    /**
     * This method will count the number of alive penguins in the provided arraylist.
     * @param  penguinFamilyNumberArrayList  An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The number of alive penguin.
     */ 
    public int countPenguinAlive(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {
        int countAlive = 0;
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            Penguin female = penguinFamily.getPenguinFemale();
            Penguin male = penguinFamily.getPenguinMale();
            if (female.getIsAlive() == true)
            {
                countAlive++;
                
            }
            if(male.getIsAlive() == true)
            {
                countAlive++;
            }
        }
        return countAlive;
    }

    /**
     * This method will count the number of killed penguins by genders in the provided arraylist.
     * @param  penguinFamilyNumberArrayList  An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The double array with two types of killed penguin, male and female.
     */ 
    public int[] countPenguinKill(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {   
        int[] penguinKill = new int[2];
        int countKillMale = 0;
        int countKillFemale = 0;
        for (PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            Penguin female = penguinFamily.getPenguinFemale();
            Penguin male = penguinFamily.getPenguinMale();
            if ((female.getIsAlive() == false) && (female.getIsCounted() == false))
            {
                countKillFemale++;
                female.setIsCounted(true);
                
            }
            if((male.getIsAlive() == false) && (male.getIsCounted() == false))
            {
                countKillMale++;
                male.setIsCounted(true);
            }
        }
        penguinKill[0] = countKillMale;
        penguinKill[1] = countKillFemale;
        return penguinKill;
    }

    /**
     * This method will count the number of uneaten eggs in the provided arraylist.
     * @param  penguinFamilyNumberArrayList  An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The number of uneaten eggs.
     */ 
    public int countUneatenEgg(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {
        int countLive = 0;
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            for(Egg egg : penguinFamily.getEggsList())
            {
                if(egg.getIsAlive())
                {
                    countLive++;
                }
            }
        }
        return countLive;
    }

    /**
     * This method will count the number of killed cat in the provided arraylist.
     * @param  catArrayList  An ArrayList containing cat objects, each representing a group of cats.
     * @param  NumberOfDogs                  The number of dogs in the simulation.
     * @return                               The number of killed cat.
     */    
    public int dogKillCat(ArrayList<Cat> catArrayList,int NumberOfDogs)
    {
        int countKill = 0;
        for (Cat cat : catArrayList)
        {
            if(cat.getIsAlive() == true && cat.isKillByDog(NumberOfDogs))
            {
                cat.setIsAlive(false);
                countKill++;
            }
        }
        return countKill;
    }

    /**
     * This method will count the number of killed fox in the provided arraylist.
     * @param  foxArrayList  An ArrayList containing fox objects, each representing a group of fox.
     * @param  NumberOfDogs                  The number of dogs in the simulation.
     * @return                               The number of killed fox.
     */    
    public int dogKillFox(ArrayList<Fox> foxArrayList,int NumberOfDogs)
    {
        int countKill = 0;
        for (Fox fox : foxArrayList)
        {
            if(fox.getIsAlive() == true && fox.isKillByDog(NumberOfDogs))
            {
                fox.setIsAlive(false);
                countKill++;
            }
        }
        return countKill;
    }

    /**
     * This method will calculate the Survival Rate of eggs by the formula after the simulation is done.
     * @param penguinFamilyNumberArrayList   An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               the double array stores he survival rate of eggs as a percentage (total_eggs_hatched / 
     *                                       total_eggs_laid) * 100 and the total number of eggs.
     */ 
    public double[] eggSurvivalRate(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {
        double[] egg = new double[2];
        int eggAlive = 0;
        int eggTotal = 0;
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            eggAlive = eggAlive + penguinFamily.getChickList().size();
            eggTotal = eggTotal + penguinFamily.getEggsList().size();
        }
        if(eggTotal == 0)
        {
            eggTotal = 1;
        }
        egg[0] = eggAlive;
        egg[1] = eggTotal;
        return egg;
    }


    /**
     * This method will calculate the Survival Rate of penguin family by the formula after the simulation is done.
     * @param penguinFamilyNumberArrayList   An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The survival rate of penguin family as a percentage (total_penguin_families_with_two_parents  /
     *                                       total_penguin_families_at_the_start)) * 100.
     */ 
    public double familyGroupSurvivalRate(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {
        int familyAlive = 0;
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            Penguin male = penguinFamily.getPenguinMale();
            Penguin female = penguinFamily.getPenguinFemale();
            if((female.getIsAlive() == true) && (male.getIsAlive() == true))
            {
                familyAlive++;
            }
        }
        return familyAlive;
        
    }


    /**
     * This method will calculate the Survival Rate of penguins by the formula after the simulation is done.
     * @param penguinFamilyNumberArrayList   An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The survival rate of penguins as a percentage (total_penguin_alive / 
     *                                       total_penguins_at_the_start) * 100.
     */ 
    public double penguinSurvivalRate(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {
        int penguinAlive = 0;
        for(PenguinFamily penguinFamily : penguinFamilyNumberArrayList)
        {
            Penguin male = penguinFamily.getPenguinMale();
            Penguin female = penguinFamily.getPenguinFemale();
            if(male.getIsAlive() == true)
            {
                penguinAlive++;
            }
            if(female.getIsAlive() == true)
            {
                penguinAlive++;
            }
        }
        return penguinAlive;
    }

    /**
     * This method will calculate the requirement survival Rate of the simulation and return the result in a double array.
     * @param penguinFamilyNumberArrayList   An ArrayList containing PenguinFamily objects, each representing a group of penguin family.
     * @return                               The four different survival Rates and an Overall colony survival result in a double array.
     */ 
    public double[] simulatingFinalReport(ArrayList<PenguinFamily> penguinFamilyNumberArrayList)
    {
        double[] report = new double[5];
        int familyTotal = penguinFamilyNumberArrayList.size();
        int penguinTotal = familyTotal * 2;
        double[] eggResult = eggSurvivalRate(penguinFamilyNumberArrayList);
        report[0] = (double) (familyGroupSurvivalRate(penguinFamilyNumberArrayList)) / familyTotal * 100;
        report[1] = (double) (penguinSurvivalRate(penguinFamilyNumberArrayList)) / penguinTotal * 100; 
        report[2] = (double) (eggResult[0]) / eggResult[1] * 100; 
        report[3] = (double) (chickSurvivalRate(penguinFamilyNumberArrayList)) / eggResult[0] * 100; 
        report[4] = (double) (penguinSurvivalRate(penguinFamilyNumberArrayList) + 
                            chickSurvivalRate(penguinFamilyNumberArrayList)) / penguinTotal;
        return report;          
    }     
}
