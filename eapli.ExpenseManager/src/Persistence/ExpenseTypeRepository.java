/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;


import Model.Expense;
import Model.ExpenseType;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mcn
 */
public class ExpenseTypeRepository {
       private static List<ExpenseType> lExpenses = new ArrayList<>();

      public static void saveExpenseType(ExpenseType expenseType) {
            lExpenses.add(expenseType);
      }
}
