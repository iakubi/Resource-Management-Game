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

    public static void main(String[] args){
        TextManagementGame game = new TextManagementGame();
        game.start();
    }
}