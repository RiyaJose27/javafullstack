public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();

        System.out.println("----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n", appTest.getStreakGoal());

        

    System.out.println("----- Price Chart Test-----");
    appTest.printPriceChart("Chai Latte Mix", 4.5, 3);
    appTest.printPriceChart("Specialty Coaster", 2.0, 5);


    System.out.println("----- Order Total Test-----");
double[] lineItems = {3.5, 1.5, 4.0, 4.5};
System.out.printf("Order total: %s \n",appTest.getOrderTotal(lineItems));





    }
}