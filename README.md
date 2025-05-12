# Paw Patrol for Penguins 🐧🐾

## Project Overview
This project is a Java-based simulation designed to evaluate the effectiveness of using specially trained dogs to protect fairy penguins at the penguin reserve on Phillip Island, Victoria. The program models the survival of penguin colonies under varying levels of dog protection, accounting for natural predator threats.

### Background
Fairy penguins on Phillip Island face threats from both land and sea predators, including foxes, cats, and sharks. A local Paw Patrol group proposed training dogs to guard penguin colonies, as similar methods have been successful in other regions. This simulation explores the potential outcomes of employing one or two trained dogs to protect the colony.

> **Disclaimer:**  
> This project is inspired by real-world conservation efforts. However, the data and calculations used in this simulation are hypothetical and are not based on actual field studies. The program was developed as a university assignment to demonstrate object-oriented programming concepts in Java. It is not intended to reflect the actual effectiveness of using dogs for penguin protection.

---

## Features 🚀
- **Simulation of Penguin Colony Survival:**  
  - Simulates one year of penguin colony survival, accounting for monthly events such as egg-laying, hatching, and predator attacks.  
- **Different Levels of Dog Protection:**  
  - Choose between no protection, one dog, or two dogs to see the impact on penguin survival.  
- **Dynamic Colony Changes:**  
  - Updates the colony state monthly, tracking the number of penguins, chicks, and eggs.  
- **Predator Impact Calculation:**  
  - Models predator attacks (foxes, cats, sharks) with varying probabilities based on dog protection levels.  
- **Result Summary:**  
  - At the end of the simulation, reports penguin, chick, egg, and overall colony survival rates.  

---

## Assumptions and Design Considerations 📝

### Key Assumptions
1. **Probability Calculations:**  
   - The simulation uses the probability values specified in the assignment.  
   - Each fox, shark, and cat has a chance to attack each penguin, egg, or chick in the family.  
   - The presence of trained dogs reduces these probabilities based on the number of dogs.  

2. **Simulation Logic:**  
   - The female penguin always encounters predators first. Although this reduces randomness, it simplifies the simulation process.  
   - To avoid counting the same animal multiple times as dead, two boolean fields are used for each animal to track their alive status.  

---

## Technologies Used 💻
- **Programming Language:** Java  
- **Object-Oriented Concepts:** Encapsulation, abstraction, polymorphism  
- **Data Structures:** Arrays, ArrayLists  
- **File Handling:** Reads initial data from `colony.txt` and writes results to `colonyFinal.txt`  

---

## Project Structure 📂
```
paw-patrol-penguins/
├── src/                      # Source code directory
│   ├── PawPatrol.java         # Main program file
│   ├── Animal.java            # Abstract base class for all animals
│   ├── Penguin.java           # Class representing a single penguin
│   ├── PenguinFamily.java     # Class representing a family of penguins
│   ├── Predator.java          # Abstract class for predators
│   ├── Cat.java               # Class for cat predator
│   ├── Fox.java               # Class for fox predator
│   ├── Shark.java             # Class for shark predator
│   ├── FileIO.java            # Handles file input/output
│   ├── SimulationCounting.java # Manages simulation state and statistics
├── data/                     
│   ├── colony.txt             # Initial data file
│   └── colonyFinal.txt        # Simulation result file
├── docs/                     # Javadoc-generated documentation
│   └── index.html
└── README.md                 # Project documentation
```

---

## Installation and Setup ⚙️
1. Clone the repository:  
   ```bash
   git clone https://github.com/GaryDou/paw-patrol-penguins.git
   ```
2. Navigate to the project directory:  
   ```bash
   cd paw-patrol-penguins
   ```
3. Compile the Java files:  
   ```bash
   javac -d bin src/*.java
   ```
4. Run the program:  
   ```bash
   java -cp bin PawPatrol
   ```
5. Follow the on-screen instructions to select the protection level and view the simulation results.

---

## Usage Instructions 📋
- The program starts with a welcome message.  
- Enter the number of dogs (0, 1, or 2) to start the simulation.  
- The simulation will run for one year (July to June), updating monthly.  
- Results will be displayed on the screen and saved to `colonyFinal.txt` in the data folder.  
- The summary includes:  
  - Number of complete family groups  
  - Number of live penguins, chicks, and eggs  
  - Family group survival rate  
  - Penguin survival rate  
  - Egg survival rate  
  - Chick survival rate  
  - Overall colony survival  

---

## Contribution Guidelines 🤝
This project is intended for viewing and sharing only, in accordance with the **CC BY-NC-ND** license.  

Since modifications and derivative works are not permitted, this project **does not accept pull requests or contributions**.  
If you have any feedback or suggestions, feel free to reach out through GitHub or via email at [zdou2598@gmail.com].   

---

## License 📜
This project is licensed under the **Creative Commons Attribution-NonCommercial-NoDerivs (CC BY-NC-ND)** license.  

### You are free to:
- **View and share** the project as-is, with attribution.  

### You may not:
- **Modify** the project.
- **Use** the project for commercial purposes.
- **Redistribute** the project or any derivative works.  

For more details, see the [Creative Commons License](https://creativecommons.org/licenses/by-nc-nd/4.0/).
Paw Patrol for Penguins © 2025 by Zhenyao Dou is licensed under Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International 


---

## Personal Statement ✍️
This project was independently developed as part of a university assignment. The primary goal was to practice object-oriented programming and simulation techniques using Java. All code was written from scratch, and no external libraries were used, except where explicitly noted.

---

## Contact 📧
If you have any questions or feedback, feel free to reach out to me through GitHub or via email at [zdou2598@gmail.com].






   
