/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author mcn
 */
public class Expense {

      private String description;
      private BigDecimal amount;
      private Date date;

      public Expense() {
      }

      public Expense(String description, Date date, BigDecimal amount) {
            this.description = description;
            this.amount = amount;
            this.date = date;
      }
}
