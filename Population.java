public abstract class Population extends Resource {

    //constructor
    public Population(String n){
        super(n);
    }
    //method to decrease population
    //i really dont know yet this might already be done

    //adding to population
    public void populationOverTime(){
        int current = this.getQuantity();
        current *= 0.5;
        this.add(current);
    }

    
}
