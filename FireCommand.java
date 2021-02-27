/**
 * A class FireCommand which the robot will use in order to
 fire at enemies
 * @author challison404
 *
 */
public class FireCommand implements Command {
    private Robot robot;
    /**
     * Default constructor for FireCommand
     * @param robot of type Robot
     */
    public FireCommand(Robot robot){
      this.robot = robot
    }

    /*
    *Execute will print out that the robot is attacking
    */
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        robot.fire();
    }

}
