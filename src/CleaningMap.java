import java.util.ArrayList;

public class CleaningMap implements ICleaningMap{
    ArrayList<Zone> zonesList;

    public CleaningMap(ArrayList<Zone> zonesList) {
        this.zonesList = zonesList;
    }

    public ArrayList<Zone> getZones() {
        return zonesList;
    }

    @Override
    public String getToken() {
        return null;
    }

    @Override
    public Action getAction() {
        return null;
    }

    @Override
    public Destination getDestination() {
        return null;
    }
}
