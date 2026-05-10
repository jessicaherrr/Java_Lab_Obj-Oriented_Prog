
package cis2900_wordfrequencies;
import java.util.Scanner;

/*
input:
5
Jess jess Jess Jason Jason

output:
Word frequencies:
Jess - 2
jess - 1
Jason - 2

Use two arrays, one array for the strings and one array for the frequencies
 */
public class CIS2900_WordFrequencies {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size;
      int frequency;
      int i;
      int j;
      
      // Step 1: Read the number of words
      size = sc.nextInt();
      
      // Create arrays with exact size needed
      String[] wordArray = new String[size];
      int[] freqArray = new int[size];
      
      // Step 2: Read all words into the array
      for (i = 0; i < size; ++i) {
         wordArray[i] = sc.next();
      }

      // Step 3: Calculate frequency for each word
      for (i = 0; i < size; ++i) {
         // Initialize frequency counter for current word
         frequency = 0;
         
         // Compare current word with all words in the array
         for (j = 0; j < size; ++j) {
            // Or use equalsIgnoreCase for case-insensitive comparison
            if (wordArray[i].equals(wordArray[j])){
               frequency++;
            }
         }
         // Store the frequency for this word
         freqArray[i] = frequency;
      }

      // Step 4: Output each unique word and its frequency only once
      System.out.println("\nWord frequencies:");
      // We need another nest loop for boolean alreadyPrinted
      for (i = 0; i < size; ++i) {
         boolean alreadyPrinted = false;
         // Check if this word has been printed before
         for (j = 0; j < i; ++j) {
            if (wordArray[i].equals(wordArray[j])) {
               alreadyPrinted = true;
               break;
            }
         }
        
         // If word hasn't been printed yet, output it with its frequency
         if (!alreadyPrinted) {
            System.out.println(wordArray[i] + " - " + freqArray[i]);
         }
      }
   }
}
