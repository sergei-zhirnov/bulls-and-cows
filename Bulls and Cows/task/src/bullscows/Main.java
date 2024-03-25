package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len;
        do {
            System.out.println("Please, enter the secret code's length:");
            try {
                len = scanner.nextInt();
                if (len > 36 || len < 1) {
                    System.out.printf("Error: can't generate a secret number with a length of " +
                            "%d because there aren't enough unique symbols.\n", len);
                    return;

                }
            } catch (Exception e) {
                System.out.println("Error: wrong input!");
                scanner.nextLine();
                return;
            }
        } while (len > 36);

        int range;
        do {
            System.out.println("Please, enter the number of possible symbols in the code:");
            try {
                range = scanner.nextInt();
                if (range > 36) {
                    System.out.printf("Error: can't generate a secret number with a length of " +
                            "%d because there aren't enough unique symbols.\n", len);
                    return;
                } else if (range < len) {
                    System.out.printf("Error: it's not possible to generate a code with a length" +
                            " of %d with %d unique symbols.\n", len, range);
                    return;

                }
            } catch (Exception e) {
                System.out.println("Error: wrong input!");
                return;
            }
        } while (range > 36 || range < len);

        Game game = new Game();
        game.code = game.generateCode(len, range);
        System.out.printf("The secret is prepared: %s\n", game.maskCode(game.code, range));
        System.out.println("Okay, let's start a game!");
        int turn = 1;
        while (game.bulls < len) {
            System.out.printf("Turn %d:\n", turn);
            String input = scanner.next();
            if (input.length() != len) {
                System.out.println("Error: wrong input!");
                return;
            } else {
                game.grade(input);
                System.out.println(game.printGrade());
                turn += 1;
            }
        }
        System.out.println("Congratulations! You guessed the secret code.");
    }

}