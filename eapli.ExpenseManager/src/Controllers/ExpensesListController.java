/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Model.ContaCorrente;
import Model.Expense;
import Persistence.ExpenseRepository;
import java.util.List;
/**
 *
 * @author mcn
 */
public class ExpensesListController {
      
      public ExpensesListController(){
            
      }
      
      public List<Expense> listExpenses(){
            ExpenseRepository repo=new ExpenseRepository();
            List <Expense> list=repo.getAllExpenses();
            return list;
      }
      
}
