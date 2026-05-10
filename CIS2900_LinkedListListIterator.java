
package cis2900_linkedlistlistiterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class CIS2900_LinkedListListIterator {

   public static void main(String[] args) {
      // Create a LinkedList that stores Integer objects
      LinkedList<Integer> numbers = new LinkedList<Integer>();
      
      // Declare a ListIterator - can move forward AND backward
      ListIterator<Integer> numIter;
      int nextNum;

      // Add three integers to the list
      numbers.add(15);  // index 0
      numbers.add(13);  // index 1
      numbers.add(14);  // index 2
      // List: [15, 13, 14]

      // STEP 1: Move iterator to the END of the list
      numIter = numbers.listIterator();
      while (numIter.hasNext()) {
         numIter.next();  // keeps moving forward until no more elements
      }
      // After this loop, numIter points PAST the last element (position 3)

      // STEP 2: Remove the LAST element (14)
      numIter.remove();  // removes the element returned by last next()
      // List becomes: [15, 13]
      // Iterator position: still at end (position 2)

      // STEP 3: Move backward one step
      if (numIter.hasPrevious()) {
         numIter.previous();  // moves to index 1 (value 13)
      }

      // STEP 4: Replace current element with 12
      numIter.set(12);  // replaces the element at index 1
      // List becomes: [15, 12]

      // STEP 5: Create a NEW iterator from beginning
      numIter = numbers.listIterator();
      
      // STEP 6: Print all elements
      while (numIter.hasNext()) {
         nextNum = numIter.next();
         System.out.println(nextNum);
      }
   }
    
}
