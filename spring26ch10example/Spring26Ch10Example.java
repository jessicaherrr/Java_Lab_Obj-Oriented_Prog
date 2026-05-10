package spring26ch10example;

public class Spring26Ch10Example {


    public static void main(String[] args) {
        //create a Product object
        Product proObj = new Product("p001", "phone", 799.99);
        //print this object
        System.out.println(proObj);
        
        //create a Book object
        Book bookObj = new Book();
        bookObj.setCode("p001");
        bookObj.setDesc("Android Programming");
        bookObj.setPrice(29.99);
        bookObj.setAuthor("Steven");
        System.out.println(bookObj);
        
        // Create a Software object
        Software s = new Software();
        s.setCode("S001");
        s.setDesc("Antivirus");
        s.setPrice(40.0);
        s.setVersion("1.2.3");
        System.out.println(s);
    
    }
    
}
