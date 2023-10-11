public abstract class Resource {
    private String name;
    private int quantity;
    private boolean isCritical;

    public Resource(String name){
        this.name = name;
        this.quantity = 0;
        this.isCritical = false;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public boolean isCritical(){
        return isCritical;
    }

    public void setIsCrticial(boolean isCritical){
        this.isCritical = isCritical;
    }

    public void add(int amount) {
        quantity += amount;
    }

    public void consume(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        } else {
            quantity = 0;
            System.out.println("Not enough " + name + " to consume.");
        }
    }
}
