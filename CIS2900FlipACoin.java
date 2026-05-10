
package cis2900flipacoin;
import java.util.Scanner;
import java.util.Random;


public class CIS2900FlipACoin {

    public static String coinFlip(Random rand) {
      String coin;
      // Generate random number (0 or 1) using rand.nextInt(2)
      int flip = rand.nextInt(2);  // Returns 0 or 1
      
      if (flip == 0) {
         coin = "Tails";           // 0 = Tails
      }
      // Do not run rand.nextInt(2)_twice
      else {                        // flip == 1
         coin = "Heads";            // 1 = Heads
      }
      return coin;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Seed used in develop mode
      int num;
      int i;
      
      num = scnr.nextInt();         // Read number of coin flips

      for (i = 0; i < num; i++) {
         // Fix: Pass the Random object (rand), not an int
         System.out.println(coinFlip(rand));
      }
   }
    
}
