/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
/**
 *
 * @author mcn
 */
public interface IExpenseRepository {
          void saveExpense(Expense exp);
  //  List<Expense> getAllExpenses();  
}
