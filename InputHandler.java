import java.util.HashMap;
import java.util.Map;
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
        HashMap<String, Command> commands;
        var pC = new PickupCommand(robot);
        var jC = new JumpCommand(robot);
        var fC = new FireCommand(robot);
        var hC = new HealCommand(robot);

        commands.put("pickup", pC);
        commands.put("jump", jC);
        commands.put("fire", fC);
        commands.put("jump", hC);
    }

    /**
     * 
     * @param data
     */
    public void inputEntered(String data) {
        if (data.equalsIgnoreCase("pickup"))
        {

        }


    }

}
