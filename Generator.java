import java.util.*;

public abstract class Generator {
    private String name;
    private ArrayList<Resource> constructionCost;
    private int resourceProductionRate;
    private int numberConstructed;
    private Resource product;

    /**
     * Creates a new Generator with the given name, construction cost, and resource production rate.
     *
     * @param name                  the name of the Generator
     * @param constructionCost      the cost in resources required to construct the Generator
     * @param resourceProductionRate the rate at which the Generator produces resources per unit of time
     * @param numberConstructed     the number of units of this generator constructed at this time
     * @param product               the type of resource this generator produces
     */
    public Generator(String name, ArrayList<Resource> constructionCost, int resourceProductionRate, int numberConstructed, Resource p1) {
        this.name = name;
        this.constructionCost = constructionCost;
        this.resourceProductionRate = resourceProductionRate;
        this.numberConstructed = numberConstructed;
        this.product = p1;
    }

    /**
     * Gets the name of the Generator.
     *
     * @return the name of the Generator
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the construction cost of the Generator.
     *
     * @return the construction cost of the Generator
     */
    public ArrayList<Resource> getConstructionCost() {
        return constructionCost;
    }

    /**
     * Gets the resource production rate of the Generator.
     *
     * @return the resource production rate of the Generator
     */
    public int getResourceProductionRate() {
        return resourceProductionRate;
    }

    /**
     * Gets the number of units constructed of this Generator.
     *
     * @return the number of units constructed of the generator
     */
    public int getNumberConstructed() {
        return numberConstructed;
    }
}
