/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dog;

public class Dog {
   private int years;
   private int weight;
   private String size;
   private int humanYears;

   private void setHumanYears() {
      int factor;
   
      if (size.equals("small")) {
         factor = 6;
      }
      else if (size.equals("medium")) {
         factor = 7;
      }
      else {
         factor = 8;
      }
   
      humanYears = years * factor;
   }
   
   public int getHumanYears() {
      return humanYears;
   }

   public void setWeightAndAge(int weightToSet, int yearsToSet) {
      weight = weightToSet;

      if (weight <= 15) {
         size = "small";
      }
      else if (weight <= 50) {
         size = "medium";
      }
      else {
         size = "large";
      }

      years = yearsToSet;
      setHumanYears();
   }
}