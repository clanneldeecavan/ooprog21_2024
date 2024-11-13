import java.util.Scanner;

public class SpoonerismGenerator {

    private static final Scanner scanner = new Scanner(System.in);

    private static String getWord(int wordNumber) {
        System.out.print("Word " + wordNumber + ": ");
        return scanner.nextLine().toLowerCase();
    }

    private static int vowelIndex(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) return i;
        }
        return -1;
    }

    private static void run() {
        String word1 = getWord(1), word2 = getWord(2);
        int vIndex1 = vowelIndex(word1), vIndex2 = vowelIndex(word2);

        if (vIndex1 <= 0 || vIndex2 <= 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
            return;
        }

        String spoonerized1 = word2.substring(0, vIndex2) + word1.substring(vIndex1);
        String spoonerized2 = word1.substring(0, vIndex1) + word2.substring(vIndex2);

        System.out.println();
        System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerized1 + " " + spoonerized2);
    }

    public static void main(String[] args) {
        run();
        scanner.close();
    }
}
