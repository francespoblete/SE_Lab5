import java.util.ArrayList;

/**
 * Contains map zones. Can be turned into a map update or a cleaning action trigger if wrapped appropriately.
 *
 * Preconditions: Must be given a list of Zone objects.
 */
public class CleaningMap implements ICleaningMap{
    ArrayList<Zone> zonesList;

    /**
     * Builds a CleaningMap.
     * Precondition: must be passed a list of zones, which must already exist.
     * Postcondition: CleaningMap contains a list of Zones
     * @param zonesList list of Zone objects to be contained in CleaningMap.
     */
    public CleaningMap(ArrayList<Zone> zonesList) {
        this.zonesList = zonesList;
    }

    /**
     * Returns the zones contained in this object
     * @return zones contained in this object
     */
    public ArrayList<Zone> getZones() {
        return zonesList;
    }

    /**
     * Returns this object's token, which is null until the object is wrapped
     * @return null
     */
    @Override
    public String getToken() {
        return null;
    }

    /**
     * Returns this object's action, which is null until the object is wrapped
     * @return null
     */
    @Override
    public Action getAction() {
        return null;
    }

    /**
     * Returns this object's destination, which is null until the object is wrapped
     * @return null
     */
    @Override
    public Destination getDestination() {
        return null;
    }
}
