import java.util.Scanner;

public class DailyPlan {
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("      DAILY STUDY SNAPSHOT (P1)       ");
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read available hours and convert to minutes.
        // TODO:
        // System.out.print("How many hours can you study today? ");
        // double availableHours = scanner.nextDouble();
        // int availableMinutes = (int) (availableHours * 60);
        // scanner.nextLine(); // consume newline

        // Step 2: Read 3 task minutes into an array.
        int[] taskMinutes = new int[3];

        // TODO:
        // for (int i = 0; i < 3; i++) {
        //     System.out.print("Enter minutes for task " + (i + 1) + ": ");
        //     taskMinutes[i] = scanner.nextInt();
        // }
        //
        // scanner.nextLine(); // consume newline if needed

        // Step 3: Use the method calculateTotalMinutes to get the total.
        // TODO:
        // int totalPlannedMinutes = calculateTotalMinutes(taskMinutes);

        // Step 4: Print totals and time advice (can reuse if/else from Lab 7).
        // TODO: Implement the comparison logic here or in another method.

        scanner.close();
    }

    /**
     * Calculates the sum of all elements in the minutes array.
     */
    private static int calculateTotalMinutes(int[] minutes) {
        // TODO: Implement the loop to sum all elements and return the total.
        // int total = 0;
        // for (int i = 0; i < minutes.length; i++) {
        //     total += minutes[i];
        // }
        // return total;

        // Temporary return so code compiles before students fill it:
        return 0;
    }
}
