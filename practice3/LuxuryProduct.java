public class LuxuryProduct extends Product{
    
    public LuxuryProduct(String name, double price){
        super(name, price);
    }
    public double getTotalPrice(){
        double taxCost = this.getPrice() * 1.0575;
        return taxCost;
        



}
}
