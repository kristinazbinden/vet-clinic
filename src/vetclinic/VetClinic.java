/**
 *  Description: Test program Vet Clinic returns array of instances of Dog object, and returns dog with highest weight.
 *  Author: Kristina Zbinden
 *  Due Date: 12/4/21
 *  Pledged: All work contained here is my own and was created without collaboration.
 *
 */
package vetclinic;

/**
 *
 * @author kristinazbinden
 */
public class VetClinic {

    /**
     * @param args the command line arguments
     */
    // Method to find the heaviest Dog object in an array
    public static Dog findHeaviestDog(Dog[] dogArray) {
        double highestWeight = dogArray[0].getWeight();
        int h = 0;

        for (int i = 0; i < dogArray.length; ++i) {
            if (dogArray[i].getWeight() > highestWeight) {
                highestWeight = dogArray[i].getWeight();
                h = i;
            }
        }

        return dogArray[h];

    }

    public static void main(String[] args) {
        // We must know the number of dogs we are going to add and set numDog variable accordingly
        int numDogs = 4;
        Dog[] allDogs = new Dog[numDogs];

        // Add Dog objects to the array allDogs
        allDogs[0] = new Dog("Lucy", "Pit Bull Mix", 38.2, "Valerie");
        allDogs[1] = new Dog("Rin Tin Tin", "German Shephard", 67.9, "Officer Tim");
        allDogs[2] = new Dog("Cujo", "Saint Bernard", 98.7, "Donna");
        allDogs[3] = new Dog("Zuzu Sunshine", "Mystery Mix", 60.2, "Kate");

        // Print all Dog instances in the array to the terminal
        System.out.println("All dogs in the array:");
        for (int i = 0; i < allDogs.length; ++i) {
            System.out.println(allDogs[i].toString());
        }
        System.out.println();

        // Print the heaviest dog to the terminal
        System.out.println("The heaviest dog is:");
        System.out.println(findHeaviestDog(allDogs));

    }
}
