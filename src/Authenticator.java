/**
 * Confirms authentication and adds authentication token to ICleaningMap objects.
 */
public class Authenticator {

    public Authenticator() {}

    /**
     * Adds TokenDecorator to ICleaningMap objects.
     *
     * Precondition: Must be given an ICleaningMap
     * Postcondition: ICleaningMap is decorated with authentication token
     *
     * @param cleaningMap ICleaningMap to be decorated with an authentication token
     * @return ICleaningMap decorated with an authentication token
     */
    public ICleaningMap authenticate(ICleaningMap cleaningMap) {
        return new TokenDecorator(cleaningMap, "token");
    }
}