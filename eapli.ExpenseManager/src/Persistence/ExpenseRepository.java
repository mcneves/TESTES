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
public class ExpenseRepository  implements IExpenseRepository
{
    // class member
    private static List<Expense> listExpense= new ArrayList<>();

    public ExpenseRepository() {}
    
    public void saveExpense(Expense exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listExpense.add(exp);
      
    }
    public List<Expense> getAllExpenses(){
          
          return Collections.unmodifiableList(listExpense);
         
    }
    
    public Expense getLastExpense(){
          Expense exp=null;
          Expense copy=null;
          int size=listExpense.size();
          if (size >0)  {   
                exp=listExpense.get(size-1);
          }
  
//          if(exp!=null){
//                          copy=new Expense(exp);
//          }
//          return copy;
          if(exp!=null){
                          exp=new Expense(exp);
          }
          return exp;
          
    }
    public Expense getFirstExpense(){
          Expense exp=null;
          int size=listExpense.size();
          if (size >0)  {   
                exp=listExpense.get(0);
          }
                   if(exp!=null){
                          exp=new Expense(exp);
          }
          return exp;

    }
}
