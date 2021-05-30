import java.util.ArrayList;

/**
 * Central controller class that processes all commands and signals. Also sends status update messages
 * in response to map-related tasks.
 */
public class Controller {
    private static Controller controllerSingleton;

    private Controller () { }

    /**
     * Gets or creates the lone instance of this class
     * @return the lone instance of this class
     */
    public static Controller instance() {
        if (controllerSingleton == null) {
            controllerSingleton = new Controller();
        }
        return controllerSingleton;
    }

    /**
     * Makes and sends the trigger to the robot interface class.
     * @param zonesList ArrayList of Zone objects for ICleaningMap
     * @param action Action to provide to Action Decorator
     * @param destination destination to provide to Action Decorator
     */
    public void makeAndSendTrigger(ArrayList<Zone> zonesList, Action action, Destination destination) {
        makeTrigger(zonesList, action, destination);
        sendTrigger();

    }

    /**
     * Makes the trigger to be sent to the robot interface
     * @param zonesList ArrayList of Zone objects for ICleaningMap
     * @param action Action to provide to Action Decorator
     * @param destination destination to provide to Action Decorator
     * @return the CleaningMap wrapped with an Action Decorator and a Token Decorator
     */
    public ICleaningMap makeTrigger(ArrayList<Zone> zonesList, Action action, Destination destination) {
        ICleaningMap cleaningMap = new ActionDecorator(new CleaningMap(zonesList), action, destination);
        return new Authenticator().authenticate(cleaningMap);
    }

    private void sendTrigger() {
        System.out.println(new StatusDisplay().status2);
    }
}