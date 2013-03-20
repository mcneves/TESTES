/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.ExpenseBootstarpper;

public class ExpenseManager {


      public static void main(String[] args) {
            
     ExpenseBootstarpper boot=new ExpenseBootstarpper();
           
            MainMenu menu = new MainMenu();
            menu.mainLoop();

      }
}
