/**
 * Class that creates an instance of a robot
 * @author John Angelidis
 */
public class Robot {
    /**
     * Constructor for a robot
     * @param name
     */
    public Robot(String name){
        System.out.println("Welcome, my name is " + name + ", I'm a friendly robot.");
    }

    /**
     * Method that represents the robot picking up an item
     */
    public void pickup(){
        System.out.println("Oh treasure, picking it up!");
    }
    /**
     * Method that represents the robot jumping
     */
    public void jump(){
        System.out.println("Oh no a hazard, I'm jumping over it.");
    }
    /**
     * Method that represents the robot blowing a torch
     */
    public void fire(){
        System.out.println("Bad guys! Fire my blow torch at them.");
    }
    /**
     * Method that represents the robot getting healed
     */
    public void heal(){
        System.out.println("Thanks for healing my wounds.");
    }
}
