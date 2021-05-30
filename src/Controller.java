import java.util.ArrayList;

public class Controller {
    private static Controller controllerSingleton;

    private Controller () { }

    public static Controller instance() {
        if (controllerSingleton == null) {
            controllerSingleton = new Controller();
        }
        return controllerSingleton;
    }

    public void makeAndSendTrigger(ArrayList<Zone> zonesList, Action action, Destination destination) {
        makeTrigger(zonesList, action, destination);
        sendTrigger();

    }

    public ICleaningMap makeTrigger(ArrayList<Zone> zonesList, Action action, Destination destination) {
        ICleaningMap cleaningMap = new ActionDecorator(new CleaningMap(zonesList), action, destination);
        return new Authenticator().authenticate(cleaningMap);
    }

    private void sendTrigger() {
        System.out.println(new StatusDisplay().status2);
    }
}