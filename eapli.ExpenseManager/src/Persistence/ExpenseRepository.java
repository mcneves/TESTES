/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mcn
 */
public class ExpenseRepository {

      private static List<Expense> lExpenses = new ArrayList<>();

      public static void saveExpense(Expense expense) {
            lExpenses.add(expense);
      }
}
