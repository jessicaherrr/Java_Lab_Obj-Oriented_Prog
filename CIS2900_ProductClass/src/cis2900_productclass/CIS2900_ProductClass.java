
package cis2900_productclass;


public class CIS2900_ProductClass {

    
    //attributes
    //private data fields
    private String productCode;
    private String productDesc;
    private double productPrice;
    
    //constructors
    //default constructor
    public Product()
    {
        productCode = "";
        productDesc = "";
        productPrice = 0.0;
    }
    
    //custom constructor with three parameters
    public CIS2900_ProductClass String desc, double price)
    {
        productCode = code;
        productDesc = desc;
        productPrice = price;
    }
    
    //create another custom constructor with 2 parameters
    //code and price
    //call it to create a Product object named product3 in the 
    //main class
    public Product(String code, double price)
    {
        productCode = code;
        productPrice = price;
    }
    
    //create an instance method to print private data fields
    public void printToConsole()
    {
        System.out.println(productCode + "|" + productDesc + "|" + productPrice);
    }
    
    //getters
    //get product code
    public String getCode( )
    {
        return productCode;
    }
    
}
