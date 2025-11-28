import java.util.Scanner;

public class P1Lab4 {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("      DAILY STUDY SNAPSHOT (P1)       ");
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for basic profile (can be brief here).
        // TODO: Ask for name and mainSubject using nextLine(), like in Lab 3.
        // String name = ...
        // String mainSubject = ...

        // Step 2: Ask how many hours they can study today.
        // TODO: Prompt: "How many hours can you study today? "
        // Use scanner.nextDouble() to read a double into availableHours.
        // double availableHours = ...

        // Step 3: Convert hours to minutes using arithmetic and casting.
        // TODO: Compute availableMinutes as int:
        // int availableMinutes = (int) (availableHours * 60);

        // Step 4: Print a short summary showing hours and minutes.
        // Example:
        // System.out.println("You can study for " + availableHours + " hours today.");
        // System.out.println("That is about " + availableMinutes + " minutes.");

        scanner.close();
    }
}
