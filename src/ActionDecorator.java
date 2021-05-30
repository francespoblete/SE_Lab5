import java.util.ArrayList;

/**
 * Wraps an ICleaningMap object and adds the functionality of providing a destination and an action
 * (update map, perform auto cleaning, perform dry cleaning, etc.).
 *
 * Precondition: Requires am ICleaningMap to be decorated
 * Postcondition: ICleaningMap is decorated
 */
public class ActionDecorator implements ICleaningMap {
    ICleaningMap cleaningMap;
    Action actionDecorated;
    Destination destination;

    /**
     * Constructor which creates an ActionDecorator wrapping an ICleaningMap object.
     * Precondition: must be given another ICleaningMap object.
     * Postcondition: the ICleaningMap object is decorated with an action and destination.
     * @param cleaningMap ICleaningMap object to be decorated
     * @param actionDecorated action String with which to decorate ICleaningMap object
     * @param destinationDecorated destination String with which to decorate ICleaningMap object
     */
    public ActionDecorator(ICleaningMap cleaningMap, Action actionDecorated, Destination destinationDecorated) {
        this.cleaningMap = cleaningMap;
        this.actionDecorated = actionDecorated;
        this.destination = destinationDecorated;
    }

    /**
     * Returns the zones contained in the ICleaningMap wrapped by this decorator
     * @return zones contained in the ICleaningMap wrapped by this decorator
     */
    @Override
    public ArrayList<Zone> getZones() {
        return cleaningMap.getZones();
    }

    /**
     * Returns the action provided by this decorator
     * @return action provided by this decorator
     */
    @Override
    public Action getAction() { return actionDecorated; }

    /**
     * Returns the destination provided by this decorator
     * @return destination provided by this decorator
     */
    @Override
    public Destination getDestination() {
        return destination;
    }

    /**
     * Returns the token contained by the ICleaningMap wrapped by this decorator
     * @return token contained by the ICleaningMap wrapped by this decorator
     */
    @Override
    public String getToken() {
        return cleaningMap.getToken();
    }
}