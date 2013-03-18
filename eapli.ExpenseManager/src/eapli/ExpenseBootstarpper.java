/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Persistence.ExpenseRepository;
import Model.Expense;
import java.math.BigDecimal;
/**
 *
 * @author mcn
 */
public class ExpenseBootstarpper {
      static {
        ExpenseRepository repo = new ExpenseRepository();
        repo.saveExpense(new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4)));
        repo.saveExpense(new Expense("Almo?o", 2013, 3, 5, new BigDecimal(12.4)));
        repo.saveExpense(new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4)));
        repo.saveExpense(new Expense("Cinema", 2013, 3, 4, new BigDecimal(5.0)));
    }
}
