import java.util.HashMap;
import java.util.Map;

import javax.lang.model.util.ElementScanner14;
/**
 * Contains a hashmap for commands and a means to call them
 * @author Coby Arambula
 */
public class InputHandler {
    
    /**
     * Parameterized constructor for the InputHandler class
     * that initializes a HashMap that contains each command
     * @param robot instance of the Robot class
     */
    public InputHandler(Robot robot) {
        HashMap<String, Command> command = new HashMap<String, Command>();
        var pC = new PickupCommand(robot);
        var jC = new JumpCommand(robot);
        var fC = new FireCommand(robot);
        var hC = new HealCommand(robot);

        command.put("pickup", pC);
        command.put("jump", jC);
        command.put("fire", fC);
        command.put("heal", hC);
    }

    /**
     * Calls the appropriate command whose key matches the
     * data parameter
     * @param data string representation of hashmap key
     */
    public void inputEntered(String data) {
        Robot robot = new Robot("robot");
        if (data.equalsIgnoreCase("pickup"))
            robot.pickup();
        else if (data.equalsIgnoreCase("jump"))
            robot.jump();
        else if (data.equalsIgnoreCase("fire"))
            robot.fire();
        else if (data.equalsIgnoreCase("jump"))
            robot.heal();
        else {
            System.out.println("An invalid command was entered");
        }
    }

}
