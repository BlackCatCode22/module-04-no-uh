import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.io.*;
public class Animal {

    //Properties
    String name;
    int age;
    String species;

    //Constructor
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    //Getters
    public String getName() {
        return name;
    }
    public  int getAge() {
        return age;
    }
    public String getSpecies() {
        return species;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public static void main(String[] args) {

        //Creating new animals
        Hyena h1 = new Hyena("Spot", 4, "Hyena", true);
        Lion l1 = new Lion("Leo", 12, "Lion", 46);
        Lion l2 = new Lion("Savannah", 9, "Lion", 46);
        Tiger t1 = new Tiger("Hobbes", 7, "Tiger", true);
        Bear b1 = new Bear("Ted", 1, "Bear", 1200);
        Bear b2 = new Bear("Koda", 3, "Bear", 1200);

        //Array list
        ArrayList<String> zooAnimalsList =
                new ArrayList<>(Arrays.asList("Spot", "Leo", "Savannah", "Hobbes", "Ted", "Koda"));
        System.out.println(zooAnimalsList.get(0));


        //Hash map
        HashMap<String, Integer> speciesCount = new HashMap<>();

        speciesCount.put("Hyena", 1);
        speciesCount.put("Lion", 2);
        speciesCount.put("Tiger", 1);
        speciesCount.put("Bear", 2);
        System.out.println(speciesCount);


        //File reading
        try {
            BufferedReader reader = new BufferedReader(new FileReader("animalNames.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("arrivingAnimals.txt"));
            String line2;
            while ((line2 = reader.readLine()) != null) {
                System.out.println(line2);
            }
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //File writing
        String[] speciesOne = {"Hyena"};
        String[] hyenaName = {"Kamari", "Shenzi", "Bud", "Wema"};
        int[] hyenaAge = {4, 12, 4, 8};
        int[] hyenaCount = {4};

        String[] speciesTwo = {"Lion"};
        String[] lionName = {"Kimba", "Elsa", "Scar", "Cecil"};
        int[] lionAge = {6, 12, 22, 4};
        int[] lionCount = {4};

        String[] speciesThree = {"Tiger"};
        String[] tigerName = {"Tigger", "Cuddles", "Tony", "Dave"};
        int[] tigerAge = {2, 4, 18, 3};
        int[] tigerCount = {4};

        String[] speciesFour = {"Bear"};
        String[] bearName = {"Paddington", "Smokey", "Snuggles", "Bungle"};
        int[] bearAge = {7, 25, 4, 4};
        int[] bearCount = {4};



        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("newAnimals.txt"));
            writer.write("Animal list:\n\n");
            writer.write(speciesOne[0] + " Amount: " + hyenaCount[0] + "\n" + hyenaName[0] + " Age: " + hyenaAge[0]);
            writer.write("\n" + hyenaName[1] + " Age: " + hyenaAge[1]);
            writer.write("\n" + hyenaName[2] + " Age: " + hyenaAge[2]);
            writer.write("\n" + hyenaName[3] + " Age: " + hyenaAge[3]);

            writer.write("\n\n" + speciesTwo[0] + " Amount: " + lionCount[0] + "\n" + lionName[0] + " Age: " + lionAge[0]);
            writer.write("\n" + lionName[1] + " Age: " + lionAge[1]);
            writer.write("\n" + lionName[2] + " Age: " + lionAge[2]);
            writer.write("\n" + lionName[3] + " Age: " + lionAge[3]);

            writer.write("\n\n" + speciesThree[0] + " Amount: " + tigerCount[0] + "\n" + tigerName[0] + " Age: " + lionAge[0]);
            writer.write("\n" + tigerName[1] + " Age: " + tigerAge[1]);
            writer.write("\n" + tigerName[2] + " Age: " + tigerAge[2]);
            writer.write("\n" + tigerName[3] + " Age: " + tigerAge[3]);

            writer.write("\n\n" + speciesFour[0] + " Amount: " + bearCount[0] + "\n" + bearName[0] + " Age: " + bearAge[0]);
            writer.write("\n" + bearName[1] + " Age: " + bearAge[1]);
            writer.write("\n" + bearName[2] + " Age: " + bearAge[2]);
            writer.write("\n" + bearName[3] + " Age: " + bearAge[3]);



            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}