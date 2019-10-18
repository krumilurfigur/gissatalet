/*
a program that let's you guess a number
2019-10-17
Gabriel Öberg
 */

import java.util.Scanner;

public class gissatalet {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int r = (int) (Math.random() * 100 + 1); // the random number
        int g = 0; // the guess
        int i = 0; // amount of guesses

        while (g != r) {

            if (g == 0) {
                System.out.println("guess a number between 1 and 100");
            }

            if (g < r && g != 0) {
                System.out.println("Guess higher!");
                i++;
            }

            if (g > r) {
                System.out.println("Guess lower!");
                i++;
            }

            g = kb.nextInt();
        }
        i++;
        System.out.println("You guessed correct in " + i + " tries!");

    }
}