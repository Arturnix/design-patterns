package co.devfoundry.fasada.artykul;

class RobotControl {

    boolean validateAuthorizationCoin() {
        System.out.println("Access granted to the control system.");
        return true;
    }

    boolean evaluateProgram() {
        System.out.println("Moves sequence accepted. Robot ready to operate");
        return true;
    }

    void runRobot() {
        System.out.println("Process start.");
    }
}
