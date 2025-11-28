import java.util.Scanner;

public class DailyPlan {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("      DAILY STUDY SNAPSHOT (P1)       ");
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for name (optional here if already done before).
        // TODO: String name = scanner.nextLine(); etc. if you want.

        // Step 2: Create an array to store 3 task names.
        String[] taskNames = new String[3];

        System.out.println("Enter your top 3 tasks for today:");

        // Step 3: Use a for loop to read task names from the user.
        // TODO:
        // for (int i = 0; i < 3; i++) {
        // System.out.print("Task " + (i + 1) + " name: ");
        // taskNames[i] = scanner.nextLine();
        // }

        // Step 4: Print all the tasks entered.
        // TODO:
        // System.out.println("\nHere are your tasks:");
        // for (int i = 0; i < 3; i++) {
        // System.out.println((i + 1) + ") " + taskNames[i]);
        // }

        scanner.close();
    }
}
