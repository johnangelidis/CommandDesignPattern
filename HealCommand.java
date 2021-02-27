public class HealCommand implements Command{
    private Robot robot;

    public HealCommand(Robot robot){
        this.robot = robot;
    }

    @author
    public void execute() {
        // TODO Auto-generated method stub
            robot.heal();
    }
    
}
