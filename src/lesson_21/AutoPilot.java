package lesson_21;

public class AutoPilot {
    private String softWareVersion;

    public AutoPilot(String softWareVersion) {
        this.softWareVersion = softWareVersion;
    }
    public String toString(){
        return "AutoPilot: { SV: " + softWareVersion + "}";
    }

    public String getSoftWareVersion() {
        return softWareVersion;
    }

    public void setSoftWareVersion(String softWareVersion) {
        this.softWareVersion = softWareVersion;
    }
}
