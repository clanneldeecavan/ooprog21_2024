public class Triangle 
{
    public static void main(String[] args) {
        int height = 7;

        for (int i = 1; i <= height; i++) 
        {
            
            for (int j = 1; j <= height - i; j++) 
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) 
            {
                System.out.print("t");
            }

            for (int j = 1; j < i; j++) 
            {
                System.out.print("t");
            }

            System.out.println();
        }
    }
}
