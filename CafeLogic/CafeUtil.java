public class CafeUtil {


    public int getStreakGoal() {
        int sum =0;
        for(var i=1; i<=10; i++)
        {
          sum = sum + i;
        }
        return sum;
    }

    public String printPriceChart(String productName, double price, int maxNumber) {
        String[] runningList = new String[maxNumber];
        for (int i=1; i <= maxNumber; i++) {
            runningList[i-1] = i + " - " + (i * price);
        }
    System.out.println(productName + "\n" + String.join("\n ", runningList) );

    return (productName   + "\n" + String.join("\n ", runningList) );
}

public Double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i=0; i <= prices.length -1; i++) {
            // System.out.println(total);
            total += prices[i];

        }
        // System.out.println(total);
        return total;
    }

    public String displayMenu (ArrayList<String> menu, ArrayList<Double> prices) {
        ArrayList<String> returnMenu = new ArrayList<String>();
        // System.out.println(menu);
        // System.out.println(prices);
        for (int i=0; i <= prices.size() -1; i++) {

            returnMenu.add(i + " " + menu.get(i) + "  --  " + "$" + prices.get(i));
            System.out.println (i + " " + menu.get(i) + "  --  " + "$" + prices.get(i));
        }
        return "See print out";
    }

    public String addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        
        String userName = System.console().readLine();
        
        System.out.println("Hello " + userName + ", there are " + customers.size() + " people ahead of you.");
        
        return userName;
    }
   public String displayMenu (ArrayList<String> menu, ArrayList<Double> prices) {
        for (int i=0; i <= prices.size() -1; i++) {

            System.out.println (i + " " + menu.get(i) + "  --  " + "$" + prices.get(i));
        }
        return "See print out";
    }

}