package q1_d_palindromechecker;

import java.util.Scanner;

public class Palindrome_Check {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a word to check if it's a palindrome:");
            String inputWord = scanner.nextLine();

            if (isPalindrome(inputWord)) {
                System.out.println(inputWord + " is a palindrome!");
            } else {
                System.out.println(inputWord + " is not a palindrome.");
            }

            scanner.close();
        }


        private static boolean isPalindrome(String word) {

            word = word.replaceAll("\\s", "").toLowerCase();

            int length = word.length();
            for (int i = 0; i < length / 2; i++) {
                if (word.charAt(i) != word.charAt(length - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }


