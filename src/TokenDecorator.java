import java.util.ArrayList;

public class TokenDecorator implements ICleaningMap {
    ICleaningMap cleaningMap;
    String token;

    public TokenDecorator(ICleaningMap cleaningMap, String token) {
        this.cleaningMap = cleaningMap;
        this.token = token;
    }

    @Override
    public ArrayList<Zone> getZones() {
        return cleaningMap.getZones();
    }

    @Override
    public Action getAction() {
        return cleaningMap.getAction();
    }

    @Override
    public Destination getDestination() {
        return cleaningMap.getDestination();
    }

    @Override
    public String getToken() {
        return token;
    }
}