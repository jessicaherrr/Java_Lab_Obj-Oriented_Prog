
package groceryshoppinglinkedlist;
import java.util.Scanner;
import java.util.LinkedList;
/*
Ex. If the input is:
milk
bread
eggs
waffles
cereal
-1

the output is:
milk
bread
eggs
waffles
cereal
 */
public class GroceryShoppingLinkedList {
    
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Declare a LinkedList called shoppingList of type ListItem
      // storing ListItem objects
      LinkedList<ListItem> shoppingList = new LinkedList<ListItem>();

      String item;
      
      // Read first item
      item = scnr.nextLine();
      
      // Read inputs until a -1 is input
      while (!item.equals("-1")) {
         // Create a new ListItem with the current item
         // wrapping String in ListItem object ***
         ListItem newItem = new ListItem(item);
         
         // Add the ListItem object to the LinkedList
         shoppingList.add(newItem);
         
         // Read next item
         item = scnr.nextLine();
      }
      
      // Print the shoppingList LinkedList using the printNodeData() method
      for (ListItem listItem : shoppingList) {
         listItem.printNodeData();
      }
   }
}

