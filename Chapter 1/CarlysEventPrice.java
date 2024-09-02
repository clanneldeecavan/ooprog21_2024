import java.util.Scanner;

public class CarlysEventPrice 
{
    public static void main(String[] args) 
    {
        System.out.println();
        System.out.println("  *************************************");
        System.out.println("  * Carly's makes the food that makes *");
        System.out.println("  *            it a party.            *");
        System.out.println("  *************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("  Enter the number of guests: ");
        int numberOfGuests = scanner.nextInt();

        int pricePerGuest = 35;
        int totalPrice = numberOfGuests * pricePerGuest;

        boolean isLargeEvent = numberOfGuests >= 50;
        
        System.out.println();
        System.out.println("  Number of guests: " + numberOfGuests);
        System.out.println("  Price per guest: $" + pricePerGuest);
        System.out.println("  Total price: $" + totalPrice);
        System.out.println("  Is it a large event? = " + isLargeEvent);
    }
}
