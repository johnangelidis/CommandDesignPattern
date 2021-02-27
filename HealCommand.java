/* 
* Class represents a robot healing.
* @author Jayden Allen
*/
public class HealCommand implements Command{
    private Robot robot;
    /**
     * Constructor for a Heal Command
     * @param robot of type Robot
     */
    public HealCommand(Robot robot){
        this.robot = robot;
    }
    /**
     * Method that execuetes a heal command.
     */
    
    public void execute() {
        robot.heal();
    }
    
}
