import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BloodData bloodData = new BloodData();

        System.out.print("Enter Blood Type: ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter Rh Factor: ");
        String rhFactor = scanner.nextLine();

        bloodData.setBloodType(bloodType);
        bloodData.setRhFactor(rhFactor);

        bloodData.displayBloodInfo();

        scanner.close();
    }
}
