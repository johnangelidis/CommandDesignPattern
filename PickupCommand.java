/**
 * Class representation of pickup command executed by the Robot class
 * @author Coby Arambula
 */
public class PickupCommand implements Command {
    private Robot robot;

    /**
     * Parameterized constructor for the PickupCommand class
     * @param robot instance of the robot class
     */
    public PickupCommand(Robot robot) {
        this.robot = robot;
    }

    /**
     * Execute method that calls the pickup() method from the
     * Robot class
     */
    @Override
    public void execute() {
        robot.pickup();
    }
    
}
