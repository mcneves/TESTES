/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.ExpenseRepository;
import Persistence.IExpenseRepository;
import java.math.BigDecimal;

/**
 *
 * @author mcn
 */
public class ContaCorrente {
      
   private static ContaCorrente instance;

    public IExpenseRepository expenseRepository;
    //public ExpenseTypeRepository  expenseTypes;
    
    private ContaCorrente()
    {       
          expenseRepository=new ExpenseRepository();
          // simulate 
          //fillInData();
    }

    public static ContaCorrente getInstance()
    {       
        if (instance == null){
            instance = new ContaCorrente();
        }
        return instance;
    }
/*
public final void fillInData(){

        expenseRepository.saveExpense(new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4)));
        expenseRepository.saveExpense(new Expense("Almo?o", 2013, 3, 5, new BigDecimal(12.4)));
        expenseRepository.saveExpense(new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4)));
        expenseRepository.saveExpense(new Expense("Cinema", 2013, 3, 4, new BigDecimal(5.0)));
    }
 */
}
