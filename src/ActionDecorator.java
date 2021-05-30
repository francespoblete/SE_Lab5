import java.util.ArrayList;

public class ActionDecorator implements ICleaningMap {
    ICleaningMap cleaningMap;
    Action actionDecorated;
    Destination destination;

    public ActionDecorator(ICleaningMap cleaningMap, Action actionDecorated, Destination destinationDecorated) {
        this.cleaningMap = cleaningMap;
        this.actionDecorated = actionDecorated;
        this.destination = destinationDecorated;
    }

    @Override
    public ArrayList<Zone> getZones() {
        return cleaningMap.getZones();
    }

    @Override
    public Action getAction() { return actionDecorated; }

    @Override
    public Destination getDestination() {
        return destination;
    }

    @Override
    public String getToken() {
        return cleaningMap.getToken();
    }
}