/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.SowExpensesController;
import Model.Expense;
import java.util.List;
import eapli.util.Console;

/**
 *
 * @author mcn
 */
public class ShowExpensesUI {

      public ShowExpensesUI() {
      }

      public void loop() {
            int op;
            Expense expense=null;
            SowExpensesController controller = new SowExpensesController();
            do {
                  op = menu();              
                  switch (op) {
                        case 0:
                              System.out.println(" End show expenses");
                              break;
                        case 1:
                              List<Expense> list= controller.getAllExpenses();
                              displayList(list);
                              break;
                               case 2:
                                 expense = controller.getFirstExpense();
                              System.out.println("First Expense"+expense);
                              break;
                        case 3:
                                 expense = controller.getLastExpense();
                              System.out.println("Last Expense"+expense);
                              break;
                        default:
                              System.out.println("Wrong option. Please repeat");
                              break;
                  }
            } while (op != 0);
      }

      private int menu() {
            System.out.println("* * *  SHOW EXPENSES  * * *\n");
            System.out.println("1. All expenses");
            System.out.println("2. First expense");
            System.out.println("3. Last expense");
            System.out.println("0. End show expenses\n\n");
            int op = Console.readInteger("Choose an option");
            return op;
      }

 
      private void displayList(List<Expense> list) {
            int i=0;
            System.out.println("List of Expenses");
            for (Expense exp : list) {
                  i=i+1;
                  System.out.println("\nExpense "+i+"\n" + exp);
            }
      }
}
