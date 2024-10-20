import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Palindrome test, please enter some text: ");
        String input = scanner.nextLine();

        String filteredInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String reversed = new StringBuilder(filteredInput).reverse().toString();

        if (filteredInput.equals(reversed)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }

        scanner.close();
    }
}
