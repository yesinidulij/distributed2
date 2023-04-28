public class Test {
   public static void main(String[] args) {
      BudgetManager budgetManager = new BudgetManager();
      Budget budget1 = new Budget("Marketing", 10000);
      Budget budget2 = new Budget("Development", 20000);
      budgetManager.addBudget(budget1);
      budgetManager.addBudget(budget2);
      BudgetThread thread1 = new BudgetThread(budgetManager, "Marketing", 5000);
      BudgetThread thread2 = new BudgetThread(budgetManager, "Development", 10000);
      thread1.start();
      thread2.start();
      try {
         thread1.join();
         thread2.join();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      budgetManager.printBudgets();
   }
}