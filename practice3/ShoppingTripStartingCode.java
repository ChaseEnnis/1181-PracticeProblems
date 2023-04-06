public class ShoppingTripStartingCode {

    public static void main(String[] args) {

        Product[] products = new Product[4];
        
        Product l1 = new LuxuryProduct("Soda", 3.50);
        products[0] = l1;

        Product l2 = new LuxuryProduct("Candy", 2.00);
        products[1] = l2;

        Product n1 = new NecessaryProduct("Cheese", 1.50);
        products[2] = n1;

        Product n2= new NecessaryProduct("Bread", 2.25);
        products[3] = n2;

        // the products array
        double total = 0;
        for (Product p : products) {
{
                System.out.println(p.toString());
            }
            total += p.getTotalPrice();
        }
        double newtotal =Math.round(total *100) / 100.0;
        System.out.println("The total cost is " + newtotal);
        
    }


}
