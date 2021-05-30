/**
 * The robot vacuum dummy that only contains a method that confirms receipt of a trigger action.
 */
public class RobotInterface {
    RobotInterface() {}

    /**
     * A method that confirms receipt of a trigger created by the controller.
     * Precondition: must be given a trigger
     * Postcondition: returns a String of text displaying the cleaning job description.
     * @param trigger a trigger that is created by the Controller
     * @return a String of text that describes the cleaning job set by the user
     */
    public String receiveTrigger(ICleaningMap trigger) {
        StringBuilder returnString = new StringBuilder();
        returnString.append(trigger.getAction().getInitializedAction())
                .append(" on ").append(trigger.getDestination().getSetDestination())
                .append(" in");
        trigger.getZones().forEach((zone) -> returnString.append(" ").append(zone.getZoneName()));
        returnString.append(" is started.");

        return returnString.toString();
    }
}