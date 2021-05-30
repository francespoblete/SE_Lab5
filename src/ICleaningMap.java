import java.util.ArrayList;

/**
 * An interface having to do with CleaningMap objects.
 */
public interface ICleaningMap {
    ArrayList<Zone> getZones();
    String getToken();
    Action getAction();
    Destination getDestination();
}
