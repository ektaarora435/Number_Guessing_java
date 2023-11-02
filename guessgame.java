import java.util.Scanner;
import java.util.Random;

    public class guessgame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int lowerBound = 1;
            int upperBound = 100;
            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) ;
            int attempts = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I've selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

            while (true) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < lowerBound || userGuess > upperBound) {
                    System.out.println("Please guess a number within the range " + lowerBound + " and " + upperBound + ".");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number, which is " + numberToGuess + ".");
                    System.out.println("It took you " + attempts + " attempts to win the game.");
                    break;
                }
            }

            scanner.close();
        }
    }

