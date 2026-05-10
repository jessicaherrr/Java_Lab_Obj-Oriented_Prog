
package cis2900_hashset;
import java.util.HashSet;
import java.util.Scanner;
/*
Ex: If the input is:
4
Italy France Korea Zambia

then the output is:
Italy is not found
Total found: 3
 */
public class CIS2900_HashSet {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      HashSet<String> countryCatalog = new HashSet<String>();
      int numCountries;
      String country;
      int totalFound;
      int i;
      
      // Pre-populate the HashSet with 5 countries
      countryCatalog.add("France");
      countryCatalog.add("Chile");
      countryCatalog.add("Greece");
      countryCatalog.add("Zambia");
      countryCatalog.add("Korea");
      
      // Read how many countries to check
      numCountries = scnr.nextInt();
      totalFound = 0;

      // Loop through each country string
      for (i = 0; i < numCountries; i++) {
         country = scnr.next();  // Read one country (ONLY ONCE per iteration)
         
         // Check if the country exists in the HashSet
         if (countryCatalog.contains(country)) {
            totalFound += 1;  // Increment counter if found
         }
         else {
            System.out.println(country + " is not found");  // Print not found message
         }
         // REMOVED the extra scnr.next() here
      }
      
      // Output total count of found countries
      System.out.println("Total found: " + totalFound);
   }
}
    
}
