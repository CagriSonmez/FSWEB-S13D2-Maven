package org.example;

public class NumberAnalyzer {

    // Palindrom Sayısı
    public static boolean isPalindrome(int number) {
        if (number < 0) return false;
        int original = number, reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    // Mükemmel Sayı
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Bölenlerin toplamı sayıya eşitse, mükemmel sayı demektir
        return sum == number;
    }

    // Sayıyı kelimelere dökme
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder wordRepresentation = new StringBuilder();

        if (number == 0) {
            return words[0];
        }

        while (number > 0) {
            int digit = number % 10;
            wordRepresentation.insert(0, words[digit] + " ");
            number /= 10;
        }

        return wordRepresentation.toString().trim();
    }
}