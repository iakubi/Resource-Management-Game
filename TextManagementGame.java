import java.util.*;

public class TextManagementGame{
    private int round; 
    private ArrayList<Resource> resources = new ArrayList<Resource>();
    private ArrayList<Generator> generators = new ArrayList<Generator>();

    private Scanner scanner;

    //need to add starting resources in 
    public TextManagementGame() {
        round = 1;
        scanner = new Scanner(System.in);
        Population ppl = new Population("Population");
        ppl.setIsCrticial(true);
        ppl.add(10);
        
    }

    public boolean haveEventThisTurn(int number){
        Random random = new Random();
        int chance = random.nextInt(number); 
        return chance == 0; 
    }

    public void viewResources(){
        for (Resource r: resources){
            System.out.println(r);
        }
    }

    public void viewGenerators(){
        for (Generator b : generators){
            System.out.println(b);
        }
    }

    public void constructGenerator(){
        //add things in here
    }

    public void endRound(){
        round++;
    }

    public void addGenerator(Generator x){
        generators.add(x);
    }

    public void start(){
        System.out.println("Welcome to the Civilization Game.");
        System.out.println("Please choose your difficulty.");
        System.out.println("\t1. Easy.");
        System.out.println("\t2. Medium.");
        System.out.println("\t3. Hard.");
        int choice = scanner.nextInt();
        int oddsOfRandomEvent;

        switch(choice) {
            case 1:
                int oddsOfRandomEvent = 10;
                break;
            case 2:
                int oddsOfRandomEvent = 5;
                break;
            case 3:
                int oddsOfRandomEvent = 3;
                break;
        }

        while (!isCriticalResourcesEmpty()){
            System.out.println("\nTime " + round);

            if (haveEventThisTurn(oddsOfRandomEvent)){
                //something lol 
            }
        }

        

    }
    public static void main(String[] args){
        TextManagementGame game = new TextManagementGame();
        game.start();
    }
}