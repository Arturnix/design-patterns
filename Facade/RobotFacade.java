package co.devfoundry.fasada.artykul;

public class RobotFacade {

    Robot robot;
    RobotControl robotControl;

    public RobotFacade() {
         robot = new Robot();
         robotControl = new RobotControl();
    }

    public void makeRobotMoves() {
        robot.authorizePersonel();
        if(robotControl.validateAuthorizationCoin()) {
            robot.setDetailsOfTheProductionProcess();
            if(robotControl.evaluateProgram()) {
                robot.startRobot();
                robotControl.runRobot();
            }
        }
    }
}
