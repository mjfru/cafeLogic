import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        
        // Imported Class Dependency
        CafeUtil cafeApp = new CafeUtil();
        
        //! Streak Goal Import & Tests:
        int getStreakGoal = cafeApp.getStreakGoal(10);
        System.out.println(getStreakGoal);

        //* Bonus 'Ninja' Challenge:
        int getStreakGoalBonus = cafeApp.getStreakGoal(5);
        System.out.println(getStreakGoalBonus);

        //? Platform Test Case:
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", cafeApp.getStreakGoal(7));

        //! Order Total & Tests:
        double[] prices = {5.5, 3.5, 1.0};
        double getOrderTotal = cafeApp.getOrderTotal(prices);
        // System.out.println(getOrderTotal);

        //? Platform Test Case:
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n", cafeApp.getOrderTotal(lineItems));

        //! Display Menu:
        // ArrayList<String> testMenu = new ArrayList<String>();
        // testMenu.add("Coffee");
        // testMenu.add("Matcha");
        // cafeApp.displayMenu(testMenu);

        //? Platform Test Case:
        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Drip Coffee");
        menu.add("Cappuccino");
        menu.add("Latte");
        menu.add("Mocha");
        cafeApp.displayMenu(menu);

        //! Add Customer:
        // ArrayList<String> customers = new ArrayList<String>();
        // cafeApp.addCustomer(customers);

        //? Platform Test Case:
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            cafeApp.addCustomer(customers);
            System.out.println("\n");
        }

        //! Price Chart (Bonus)
        cafeApp.printPriceChart("Columbian Coffee Grounds", 15.00, 3);
    }
}