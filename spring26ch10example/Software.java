package spring26ch10example;

public class Software extends Product {

    private String version;

    // default constructor
    public Software() {
        super();
        version = "";
    }

    // constructor with parameters
    public Software(String code, String description, double price, String version) {
        super(code, description, price);
        this.version = version;
    }

    // getter
    public String getVersion() {
        return version;
    }

    // setter
    public void setVersion(String v) {
        version = v;
    }

    // toString override
    @Override
    public String toString() {
        return super.toString() + "Version: " + version + "\n";
    }
}