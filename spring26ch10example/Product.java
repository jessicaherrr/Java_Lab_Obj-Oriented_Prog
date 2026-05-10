package spring26ch10example;

public class Product {
    
    //private data fields
    private String code;
    private String desc;
    private double price;
    
    // default constructor
    public Product() {
        code = "";
        desc = "";
        price = 0.0;
    }
    
    // constructor with 3 parameters
    public Product(String c, String d, double p) {
        code = c;
        desc = d;
        price = p;
    }
    
    // constructor with 2 parameters
    public Product(String code, double price) {
        this.code = code;
        this.desc = "";
        this.price = price;
    }
    
    //instance method: printToConsole()
    public void printToConsole() {
        System.out.println(code + "|" + desc + "|" + price);
    }
    
    @Override
    public String toString() {
        return "Code: " + code + "\n"
             + "Description: " + desc + "\n"
             + "Price: " + price + "\n";
    }

    // getters
    public String getCode() {
        return code;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getDesc() {
        return desc;
    }
    
    // setters
    public void setCode(String c) {
        code = c;
    }
    
    public void setDesc(String d) {
        desc = d;
    }
    
    public void setPrice(double p) {
        price = p;
    }
    
    // overloaded print method
    public void printToConsole(String sep) {
        System.out.println(code + sep + desc + sep + price);
    }
}