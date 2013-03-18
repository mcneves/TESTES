/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ContaCorrente;
import java.math.BigDecimal;
import java.util.Date;
import Model.Expense;
import Persistence.ExpenseRepository;

/**
 *
 * @author mcn
 */
public class ExpenseRegisterController {

      public ExpenseRegisterController() {
      }

      public void registerExpense(String what, Date date, BigDecimal amount) {
            Expense expense = new Expense(what, date, amount);
            ContaCorrente.getInstance().expenseRepository.saveExpense(expense);
      }
}
