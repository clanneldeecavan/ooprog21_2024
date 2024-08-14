public class TableAndChairs {
    public static void main(String[] args) {
        int width = 25;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= width; j++) {
                if (j == 0 || j == 4 || j == 20 || j == 24) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int j = 0; j <= width; j++) {
            if (j == 4 || j == 20 || (j >= 8 && j <= 16)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= width; j++) {
                if (j == 0 || j == 4 || j == 8 || j == 16 || j == 20 || j == 24) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
