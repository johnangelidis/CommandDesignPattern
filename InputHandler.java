import java.util.HashMap;
/**
 * Contains a hashmap for commands and a means to call them
 * @author Coby Arambula
 */
public class InputHandler {
    HashMap<String, Command> command;
    /**
     * Parameterized constructor for the InputHandler class
     * that initializes a HashMap that contains each command
     * @param robot instance of the Robot class
     */
    public InputHandler(Robot robot) {
        command = new HashMap<String, Command>();
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
        if ((data.equalsIgnoreCase("pickup") || data.equalsIgnoreCase("jump") ||
                                                data.equalsIgnoreCase("fire") || data.equalsIgnoreCase("heal")))
            command.get(data).execute();
        else
            System.out.println("An invalid command was entered");
    }
}


