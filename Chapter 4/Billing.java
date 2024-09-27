public class Billing {
    public static final double TAX = 0.08; 

    public void calculateBill(double price) {
        double totalPrice = price + (price * TAX); 
        System.out.println("The total price for the bill is: $" + totalPrice);
        
    }

    public void calculateBill(double price, int quantity) {
        double totalPrice = (price * quantity) + (price * quantity * TAX); 
        System.out.println("The total price for the bill is: $" + totalPrice);
        
    }

    public void calculateBill(double price, int quantity, int couponDiscount) {
        double discountedPrice = (price * quantity) - couponDiscount; 
        double totalPrice = discountedPrice + (discountedPrice * TAX); 
        System.out.println("The total price for the bill is: $" + totalPrice);
    }

    public static void main(String[] args) {
        Billing billing = new Billing();
        billing.calculateBill(23.2);                  
        billing.calculateBill(24.4, 2);       
        billing.calculateBill(40.45, 2, 10);  
    }
}
