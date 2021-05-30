public class Authenticator {

    public Authenticator() {}

    public ICleaningMap authenticate(ICleaningMap cleaningMap) {
        return new TokenDecorator(cleaningMap, "token");
    }
}