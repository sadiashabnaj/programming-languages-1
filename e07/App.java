import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidPassword = false;

        while (!isValidPassword) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            if (validatePassword(password)) {
                System.out.println("Password is valid.");
                isValidPassword = true;
            } else {
                System.out.println("Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter, one lowercase letter, and one digit.");
            }
        }

        scanner.close();
    }

    public static boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit;
    }
}
