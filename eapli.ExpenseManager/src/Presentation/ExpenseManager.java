/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.ExpensesBootstrapper;

public class ExpenseManager {


      public static void main(String[] args) {
            ExpensesBootstrapper boot=new ExpensesBootstrapper();
            MainMenu menu = new MainMenu();
            menu.mainLoop();

      }
}
