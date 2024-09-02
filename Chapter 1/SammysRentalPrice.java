import java.util.Scanner;

public class SammysRentalPrice 
{
    public static void main (String []args)
    {
        System.out.println();
        System.out.println("  SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("  S Sammy's makes it fun in the sun. S");
        System.out.println("  SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        final int RENTAL_RATE_PER_HOUR = 40;
        final int RENTAL_RATE_PER_ADDITIONAL_MINUTE = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("  Enter the number of minutes rented: ");
        int totalMinutes = scanner.nextInt();

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        int totalPrice = (hours * RENTAL_RATE_PER_HOUR) + (minutes * RENTAL_RATE_PER_ADDITIONAL_MINUTE);
        
        System.out.println();
        System.out.println("  Hours: " + hours);
        System.out.println("  Minutes: " + minutes);
        System.out.println("  Total Price: $" + totalPrice);
    }
}
