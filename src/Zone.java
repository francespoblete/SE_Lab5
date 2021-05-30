/**
 * Contains Zones that belong in an ICleaningMap.
 * A zone will include a name for the zone as well as information on coordinates outlining the zone boundaries.
 * For prototype purposes, the coordinates are just Strings.
 */
public class Zone {
    String zoneName;

    public Zone(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getZoneName() {
        return this.zoneName;
    }
}
