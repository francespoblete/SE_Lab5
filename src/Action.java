/**
 * Contains the action associated with a decorated ICleaningMap.
 * For prototype purposes, the action is just a String.
 */
public class Action {
    String action;

    /**
     * Creates an Action object
     * @param action The String representing this action
     */
    public Action(String action) {
        this.action = action;
    }

    public String getInitializedAction() {
        return this.action;
    }
}