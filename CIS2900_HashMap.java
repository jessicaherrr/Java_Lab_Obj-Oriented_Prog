
package cis2900_hashmap;
import java.util.Scanner;
import java.util.HashMap;

/* 
Ex: If the input is:
4
Zoe 83.0 Meg 73.5 Ani 50.0 Meg 73.0

then one possible output is:
Key: Zoe, Value: 83.0
Key: Meg, Value: 73.0
Key: Ani, Value: 50.0
*/

public class CIS2900_HashMap {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String personName;
      double examScore;
      int dataCount;
      int i;
      
      // DECLARE HashMap with String key and Double value
      HashMap<String, Double> testPerformance = new HashMap<String, Double>();

      // READ integer dataCount from input
      dataCount = scnr.nextInt();

      // READ dataCount key-value pairs and insert into HashMap
      for (i = 0; i < dataCount; i++) {
         personName = scnr.next();      // Read the name (String)
         examScore = scnr.nextDouble(); // Read the score (double)
         testPerformance.put(personName, examScore);  // Insert/Replace
      }

      // For each key in the HashMap, retrieve the value associated with the key
      for (String key : testPerformance.keySet()) {
         System.out.println("Key: " + key + ", Value: " + testPerformance.get(key));
      }
   }
}