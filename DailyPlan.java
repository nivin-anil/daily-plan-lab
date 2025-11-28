import java.util.Scanner;

public class DailyPlan {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("      DAILY STUDY SNAPSHOT (P1)       ");
        System.out.println("=======================================");

        // Step 1: Create a Scanner to read from the console.
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user for their profile details.
        // TODO: Use System.out.print to ask:
        //  - "What is your name? "
        //  - "What is your main subject today? "
        //  - "What is your current level? (Beginner / Intermediate / Advanced) "
        //
        // TODO: Use scanner.nextLine() to read each answer into String variables:
        //  - name
        //  - mainSubject
        //  - level

        // Step 3: Print a welcome message that uses the input values.
        // Example (students need to implement):
        // System.out.println("Welcome, " + name + "! Let's plan your " + mainSubject + " study day.");

        // Always good practice to close the scanner (we'll refine this later in bigger programs).
        scanner.close();
    }
}