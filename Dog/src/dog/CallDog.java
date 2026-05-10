/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dog;

public class CallDog {
   public static void main(String [] args) {
      Dog buddy = new Dog();

      buddy.setWeightAndAge(57, 2);
      System.out.print("Human years: " + buddy.getHumanYears());
   
   }
}