/**
 * Class that represents a robot jumping
 * @author John Angelidis
 */
public class JumpCommand implements Command {
    private Robot robot;
    /**
     * Constructor for a jump command
     * @param robot of type Robot
     */
    public JumpCommand(Robot robot){
        this.robot = robot;
    }
    /**
     * Method that executes a jump command
     */
    @Override
    public void execute() {
        robot.jump();

    }
    
}
