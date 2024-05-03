package prototypePattern;

public class GpsSystem {
    private String version;

    public GpsSystem(String version) {
        this.version = version;
    }

    public GpsSystem(GpsSystem source) {
        this.version = source.version;
    }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
}
