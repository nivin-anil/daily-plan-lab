import java.util.Scanner;

public class DailyPlan {
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("      DAILY STUDY SNAPSHOT (P1)       ");
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);

        // Step 1: Use askString to read profile.
        // TODO:
        // String name = askString(scanner, "What is your name? ");
        // String mainSubject = askString(scanner, "What is your main subject today? ");

        // Step 2: Use askInt / askString for tasks.
        String[] taskNames = new String[3];
        int[] taskMinutes = new int[3];

        // TODO:
        // for (int i = 0; i < 3; i++) {
        //     System.out.println("\nTask " + (i + 1) + ":");
        //     taskNames[i] = askString(scanner, "  Name: ");
        //     taskMinutes[i] = askInt(scanner, "  Estimated minutes: ");
        // }

        // Step 3: Use a method from Lab 8 (or reimplement) to calculate total minutes.
        // TODO: int totalPlannedMinutes = calculateTotalMinutes(taskMinutes);

        // Optional: compare to available time, like before.

        scanner.close();
    }

    /**
     * Reads a full line of text after printing a prompt.
     */
    private static String askString(Scanner scanner, String prompt) {
        // TODO:
        // 1. Print the prompt.
        // 2. Read a full line of input using scanner.nextLine().
        // 3. Return the line.
        //
        // Example:
        // System.out.print(prompt);
        // return scanner.nextLine();

        return ""; // temporary so code compiles
    }

    /**
     * Reads an integer from the console after printing a prompt.
     */
    private static int askInt(Scanner scanner, String prompt) {
        // TODO:
        // 1. Print the prompt.
        // 2. Use scanner.nextInt() to read an int.
        // 3. Consume the leftover newline using scanner.nextLine().
        // 4. Return the int.
        //
        // Example:
        // System.out.print(prompt);
        // int value = scanner.nextInt();
        // scanner.nextLine();
        // return value;

        return 0; // temporary so code compiles
    }

    /**
     * Same as Lab 8 – helper to sum minutes.
     */
    private static int calculateTotalMinutes(int[] minutes) {
        int total = 0;
        for (int i = 0; i < minutes.length; i++) {
            total += minutes[i];
        }
        return total;
    }
}
