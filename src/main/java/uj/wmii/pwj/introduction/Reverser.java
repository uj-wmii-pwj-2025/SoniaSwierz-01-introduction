package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String input) {

        if (input != null) {
            input = input.trim();

            return new StringBuilder(input).reverse().toString();
        } else
            return null;
    }

    public String reverseWords(String input) {

        if (input != null) {
            input = input.trim();

            String[] words = input.split("\\s+");

            StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]);
                if (i > 0) reversed.append(" ");
            }

            return reversed.toString();
        } else
            return null;
    }

}
