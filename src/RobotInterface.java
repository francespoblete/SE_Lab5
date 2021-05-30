import java.util.ArrayList;

public class RobotInterface {
    RobotInterface() {}

    public String receiveTrigger(ICleaningMap trigger) {
        StringBuilder returnString = new StringBuilder("");
        returnString.append(trigger.getAction().getInitializedAction())
                .append(" on ").append(trigger.getDestination().getSetDestination())
                .append(" in");
        trigger.getZones().forEach((zone) -> returnString.append(" ").append(zone.getZoneName()));
        returnString.append(" is started.");

        return returnString.toString();
    }
}