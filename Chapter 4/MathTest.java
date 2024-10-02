import java.util.Scanner;

public class MathTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("SQRT: " + Math.sqrt(37));
        System.out.println("SIN: " + Math.sin(300));
        System.out.println("COS: " + Math.cos(300));
        System.out.println("FLOOR: " + Math.floor(22.8));
        System.out.println("CEIL: " + Math.ceil(22.3));
        System.out.println("ROUND: " + Math.round(22.7));
        System.out.println("MAX: " + Math.max(71, 68)); //num 1, num2
        System.out.println("MIN: " + Math.min(71, 68)); //num 1, num 2
        
        System.out.printf("Enter the maximum value for random number: ");
        double max = scanner.nextDouble(); 

        double randomValue = Math.random() * max;
                System.out.println("RANDOM: " + randomValue); 

        scanner.close(); 
    }
}
