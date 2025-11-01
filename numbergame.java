import java.util.*;

class numbergame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        char playAgain = 'y';

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Try to guess the number between 1 to 100.\n");

        while (playAgain == 'y' || playAgain == 'Y') {

            int number = rand.nextInt(100) + 1;
            int attempts = 5;
            boolean correct = false;

            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Congrats! You guessed it right 🎉");
                    correct = true;
                    score++;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high! Try smaller number.");
                } else {
                    System.out.println("Too low! Try bigger number.");
                }

                attempts--;
                if (attempts > 0)
                    System.out.println("Attempts left: " + attempts);
            }

            if (!correct) {
                System.out.println("Sorry! The correct number was " + number);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Play again? (y/n): ");
            playAgain = sc.next().charAt(0);
            System.out.println();
        }

        System.out.println("Game Over! Final score = " + score);
        System.out.println("Thanks for playing!");
        sc.close();
    }
}
