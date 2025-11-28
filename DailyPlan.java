import java.util.Scanner;

public class DailyPlan {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("      DAILY STUDY SNAPSHOT (P1)       ");
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read available time (hours → minutes) as in Lab 6.
        // double availableHours = ...
        // int availableMinutes = ...

        // TODO: Implement the code to read hours and compute availableMinutes.

        // Step 2: Read 3 task durations and compute totalPlannedMinutes.
        int[] taskMinutes = new int[3];

        // TODO: Ask for 3 task minutes and sum them into totalPlannedMinutes.
        // int totalPlannedMinutes = 0;
        // for (int i = 0; i < 3; i++) {
        //     System.out.print("Enter minutes for task " + (i + 1) + ": ");
        //     taskMinutes[i] = scanner.nextInt();
        //     totalPlannedMinutes += taskMinutes[i];
        // }

        // Step 3: Compare totalPlannedMinutes and availableMinutes using if/else.
        // TODO:
        // if (totalPlannedMinutes < availableMinutes) {
        //     System.out.println("Great! You still have some free time left.");
        // } else if (totalPlannedMinutes == availableMinutes) {
        //     System.out.println("Perfectly packed day! You used all available time.");
        // } else {
        //     System.out.println("Warning: You planned more than your available time.");
        // }

        scanner.close();
    }
}
