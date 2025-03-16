import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Array to store choices
        String[] choices = {"Rock", "Paper", "Scissors"};
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        while (true) {
            // Prompt user for input
            System.out.print("Enter your choice (Rock, Paper, Scissors) or 'exit' to quit: ");
            String userInput = scanner.nextLine().trim();
            
            // Exit condition
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            // Convert user input to corresponding index
            int userChoice = -1;
            for (int i = 0; i < choices.length; i++) {
                if (choices[i].equalsIgnoreCase(userInput)) {
                    userChoice = i;
                    break;
                }
            }
            
            // Validate user input
            if (userChoice == -1) {
                System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
                continue;
            }
            
            // Generate computer's choice randomly
            int computerChoice = random.nextInt(3);
            System.out.println("Computer chose: " + choices[computerChoice]);
            
            // Determine winner
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        
        // Close scanner
        scanner.close();
    }
}
