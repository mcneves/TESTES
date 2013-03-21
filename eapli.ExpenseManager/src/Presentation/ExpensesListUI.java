/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpensesListController;
import Model.Expense;
import java.util.List;

/**
 *
 * @author mcn
 */
public class ExpensesListUI {
      public void run() {


            ExpensesListController controller = new ExpensesListController();
            //      controller.registerExpense(what, date, amount, ExpenseTypes.MISC);
            List<Expense> list=controller.listExpenses();
            System.out.println("* * *  LIST EXPENSES  * * *\n");
            for(Expense expense: list){
                  System.out.println("Despesa:"+expense);
      }

      }
}
