import java.util.ArrayList;

public class CafeUtil {

    //! Streak Goal
    public int getStreakGoal(int numWeeks) {
        int drinkTotal = 0;
        for(int i = 1; i <= numWeeks; i++){
            drinkTotal += i;
        }
        return drinkTotal;
    }

    //! Order Total
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    //! Display Menu
    public void displayMenu(ArrayList<String> menuItems) {
        int i = 0;
        while (i < menuItems.size()) {
            System.out.println(menuItems.get(i));
            i++;
        }
    }

    //! Add Customer
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username);
        int lineSize = customers.size();
        System.out.println("There is/are " + lineSize + " people in front of you.");
        customers.add(username);
        System.out.println(customers + " is/are currently waiting in line.");
    }

    //! Price Chart (Bonus)
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            double total = price * i;
            System.out.println(i + " - $" + String.format("%.2f", total));
        }
    }
}