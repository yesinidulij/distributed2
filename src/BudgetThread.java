public class BudgetThread extends Thread {
   private BudgetManager budgetManager;
   private String budgetName;
   private double amount;
   public BudgetThread(BudgetManager budgetManager, String budgetName, double amount) {
      this.budgetManager = budgetManager;
      this.budgetName = budgetName;
      this.amount = amount;
   }
   public void run() {
      Budget budget = budgetManager.getBudget(budgetName);
      synchronized (budget) {
         double currentAmount = budget.getAmount();
         currentAmount += amount;
         budget.setAmount(currentAmount);
         System.out.println("Added " + amount + " to " + budgetName);
      }
   }
}