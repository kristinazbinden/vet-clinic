package vetclinic;

/**
 *
 * @author kristinazbinden
 */
public class Dog {

    private String name;
    private String breed;
    private double weight;
    private String owner;

    public Dog() {
        name = "N/A";
        breed = "N/A";
        weight = 0.0;
        owner = "N/A";
    }

    /**
     * Initializing Constructor
     *
     * @param name The name of the dog
     * @param breed The breed of the dog
     * @param weight The weight of the dog
     * @param ownerName The name of the owner
     */
    public Dog(String name, String breed, double weight, String ownerName) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        owner = ownerName;
    }

    //Set dog name
    public void setName(String dogName) {
        name = dogName;
    }

    //Get dog Name
    public String getName() {
        return name;
    }

    //Set dog breed
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

    //Get dog breed
    public String getBreed() {
        return breed;
    }

    //Set dog weight 
    public void setWeight(double dogWeight) {
        weight = dogWeight;
    }

    //Get dog weight 
    public double getWeight() {
        return weight;
    }

    //Set dog owner
    public void setOwner(String dogOwner) {
        owner = dogOwner;
    }

    //Get dog owner
    public String getOwner() {
        return owner;
    }

    //Format dog properties to return on method call
    public String toString() {
        String dogStr = this.getName() + "(" + this.getBreed() + "), "
                + this.getWeight() + " pounds, owned by " + this.getOwner();

        return dogStr;
    }

}
