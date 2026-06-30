import java.util.Scanner;

public class NumberGuessingGame {

    public static void guessNumber() {

        final int MAX_ATTEMPTS = 5;
        char playAgain;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("=================================");
            System.out.println(" Welcome to the Number Guessing Game");
            System.out.println("=================================");

            do {

                int secretNumber = (int) (Math.random() * 100) + 1;
                int remainingAttempts = MAX_ATTEMPTS;
                boolean hasWon = false;

                System.out.println("\nI have selected a number between 1 and 100.");
                System.out.println("You have " + MAX_ATTEMPTS + " attempts.");

                while (remainingAttempts > 0) {

                    System.out.print("Enter your guess: ");
                    int userGuess = scanner.nextInt();

                    remainingAttempts--;

                    if (userGuess < secretNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (userGuess > secretNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number.");
                        hasWon = true;
                        break;
                    }

                    if (remainingAttempts > 0) {
                        System.out.println("Remaining attempts: " + remainingAttempts);
                    }
                }

                if (!hasWon) {
                    System.out.println("Sorry! You have used all your attempts.");
                    System.out.println("The correct number was: " + secretNumber);
                }

                System.out.print("\nDo you want to play again? (y/n): ");
                playAgain = scanner.next().charAt(0);

            } while (playAgain == 'y' || playAgain == 'Y');

            System.out.println("\nThank you for playing!");
        }
    }

    public static void main(String[] args) {
        guessNumber();
    }
}