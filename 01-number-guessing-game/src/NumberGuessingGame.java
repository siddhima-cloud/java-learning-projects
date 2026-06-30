public class NumberGuessingGame {

    public static void guessNumber() {
        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int attempts = 5;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have " + attempts + " attempts to guess the number.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts--;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number!");
                break;
            }

            if (attempts == 0) {
                System.out.println("Sorry, you've run out of attempts. The number was: " + secretNumber);
            } else {
                System.out.println("You have " + attempts + " attempts left.");
            }

        } while (attempts > 0);

        sc.close();
    }

    public static void main(String[] args) {
        guessNumber();
    }
}