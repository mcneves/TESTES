/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.ExpenseRepository;
import Persistence.IExpenseRepository;

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
        
    }

    public static ContaCorrente getInstance()
    {       
        if (instance == null)
            instance = new ContaCorrente();
            
        return instance;
    }

}
