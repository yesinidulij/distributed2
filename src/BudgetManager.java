

import java.util.concurrent.ConcurrentHashMap;

public class BudgetManager {
   private ConcurrentHashMap<String, Budget> budgets;
   public BudgetManager() {
      budgets = new ConcurrentHashMap<String, Budget>();
   }
   public void addBudget(Budget budget) {
      budgets.put(budget.getName(), budget);
   }
   public void removeBudget(String name) {
      budgets.remove(name);
   }
   public Budget getBudget(String name) {
      return budgets.get(name);
   }
   public void printBudgets() {
      for (Budget budget : budgets.values()) {
         System.out.println(budget.getName() + ": " + budget.getAmount());
      }
   }
}