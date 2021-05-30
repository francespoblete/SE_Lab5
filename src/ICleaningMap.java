import java.util.ArrayList;

public interface ICleaningMap {
    ArrayList<Zone> getZones();
    String getToken();
    Action getAction();
    Destination getDestination();
}
