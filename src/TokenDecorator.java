import java.util.ArrayList;

/**
 * Wraps an ICleaningMap object and adds the functionality of providing authentication.
 */
public class TokenDecorator implements ICleaningMap {
    ICleaningMap cleaningMap;
    String token;

    /**
     * Constructor which creates a TokenDecorator wrapping an ICleaningMap object.
     * Precondition: must be given another ICleaningMap object.
     * Postcondition: the ICleaningMap object is decorated with an authentication token.
     * @param cleaningMap ICleaningMap object to be decorated
     * @param token a token wrapped with the ICleaningMap
     */
    public TokenDecorator(ICleaningMap cleaningMap, String token) {
        this.cleaningMap = cleaningMap;
        this.token = token;
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
     * Returns the action contained by the ICleaningMap wrapped by this decorator
     * @return action contained by the ICleaningMap wrapped by this decorator
     */
    @Override
    public Action getAction() {
        return cleaningMap.getAction();
    }

    /**
     * Returns the destination provided by this decorator
     * @return destination provided by this decorator
     */
    @Override
    public Destination getDestination() {
        return cleaningMap.getDestination();
    }

    /**
     * Returns the token provided by this decorator
     * @return token provided by this decorator
     */
    @Override
    public String getToken() {
        return token;
    }
}