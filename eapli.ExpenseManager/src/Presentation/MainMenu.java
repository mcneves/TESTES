package Presentation;

import eapli.util.Console;
import Presentation.ShowExpensesUI;


public class MainMenu {

      public MainMenu() {
      }

      public void mainLoop() {
            int op;
            do {
                  op = menu();
                  switch (op) {
                        case 0:
                              System.out.println("bye bye ...");
                              break;
                        case 1:
                              ExpenseRegisterUI expenseregisterUI = new ExpenseRegisterUI();
                              expenseregisterUI.run();
                              break;
                        case 2:
                              ShowExpensesUI ui = new ShowExpensesUI();
                              ui.loop();
                              break;
                              
                        case 3:
                //              ExpenseTypeRegisterUI ui = new ListingExpensesUI();
                  //            ui.loopUI();
                              break;

                  }
            } while (op != 0);

      }

      private static int menu() {
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");
            System.out.println("1. Register an expense");
            System.out.println("2. Show expenses");
            System.out.println("3. Register expense types");
            
            System.out.println("0. Exit\n\n");

            int option = Console.readInteger("Please choose an option");
            return option;
      }
}
