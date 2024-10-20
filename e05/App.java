import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder names = new StringBuilder();  // To store concatenated names

        while (true) {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("Quit")) {
                break;
            }

            names.append(name);
            System.out.println(names.toString());
        }

        scanner.close();
        
    }
}
