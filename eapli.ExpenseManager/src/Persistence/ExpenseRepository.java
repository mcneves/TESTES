/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author losa
 */
public class ExpenseRepository implements IExpenseRepository {
      // class member

      private static List<Expense> listExpense = new ArrayList<>();

      public ExpenseRepository() {
      }

      @Override
      public void saveExpense(Expense exp) {
            if (exp == null) {
                  throw new IllegalArgumentException();

            }
            listExpense.add(exp);

      }

      @Override
      public List<Expense> getAllExpenses() {
            List<Expense> list = listExpense;
            list = Collections.unmodifiableList(list);
            return list;
      }
}
