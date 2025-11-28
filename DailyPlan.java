import java.util.Scanner;

public class DailyPlan {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("      DAILY STUDY SNAPSHOT (P1)       ");
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask how many hours they can study and convert to minutes (reuse Lab 4).
        // TODO:
        // System.out.print("How many hours can you study today? ");
        // double availableHours = scanner.nextDouble();
        // int availableMinutes = (int) (availableHours * 60);
        //
        // IMPORTANT: After nextDouble(), consume the leftover newline:
        // scanner.nextLine();

        // Step 2: Read 3 task names (reuse Lab 5).
        String[] taskNames = new String[3];
        int[] taskMinutes = new int[3];

        System.out.println("\nEnter your top 3 tasks for today:");

        // TODO: For each task:
        //  - Read task name using nextLine()
        //  - Ask for estimated minutes using nextInt()
        //  - Consume newline after nextInt()
        //
        // for (int i = 0; i < 3; i++) {
        //     System.out.println("\nTask " + (i + 1) + ":");
        //     System.out.print("  Name: ");
        //     taskNames[i] = scanner.nextLine();
        //
        //     System.out.print("  Estimated minutes: ");
        //     taskMinutes[i] = scanner.nextInt();
        //     scanner.nextLine(); // consume leftover newline
        // }

        // Step 3: Compute totalPlannedMinutes.
        // TODO: Use a loop or direct sum:
        // int totalPlannedMinutes = 0;
        // for (int i = 0; i < 3; i++) {
        //     totalPlannedMinutes += taskMinutes[i];
        // }

        // Step 4: Print summary of tasks and total planned time.
        // TODO: Print each task with its minutes and then:
        // System.out.println("Total planned time: " + totalPlannedMinutes + " minutes.");
        // System.out.println("Available time: " + availableMinutes + " minutes.");

        scanner.close();
    }
}
