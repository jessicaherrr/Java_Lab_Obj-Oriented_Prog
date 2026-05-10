
package cis2900_hashmapremove;
import java.util.HashMap;
import java.util.Scanner;

/*
input:
2
Eli Ken

output:
Removing entry: Eli->86.0
Removing entry: Ken->76.5
studentAndScore has:
Key: Dan, Value: 61.5
*/

public class CIS2900_HashMapRemove {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      HashMap<String, Double> studentAndScore = new HashMap<String, Double>();
      String personName;
      double examScore;
      int numToRead;
      int i;

      studentAndScore.put("Eli", 86.0);
      studentAndScore.put("Dan", 61.5);
      studentAndScore.put("Ken", 76.5);

      numToRead = scnr.nextInt();
      for (i = 0; i < numToRead; ++i) {
         personName = scnr.next();
         
         // Check if the string is a KEY in studentAndScore (not containsValue)
         if (studentAndScore.containsKey(personName)) {
            // Output BEFORE removing: "Removing entry: " + key + "->" + value
            System.out.println("Removing entry: " + personName + "->" + studentAndScore.get(personName));
            // Then remove the map entry for that key
            studentAndScore.remove(personName);
         }
      }

      if (studentAndScore.keySet().size() > 0) {
         System.out.println("studentAndScore has:");
         // For each key in the HashMap, retrieve the value associated with the key
         for (String key : studentAndScore.keySet()) {
            System.out.println("Key: " + key + ", Value: " + studentAndScore.get(key));
         }
      }
      else {
         System.out.println("studentAndScore is empty");
      }
   }
}
