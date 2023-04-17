import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
        String isOrIsNot = "";
        String inputWord;

        while (true) {
            // This line asks the user for input by popping out a single window
            // with text input
            inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");

            // terminate if the user inputs "STOP"
            if (inputWord.equalsIgnoreCase("STOP"))
                System.exit(0);
                // if the inputWord is contained within wordArray return true
            else if (wordIsThere(inputWord, wordArray))
                isOrIsNot = "is"; // set to is if the word is on the list
            else
                isOrIsNot = "is not"; // set to is not if the word is not on the list

            // Output to a JOptionPane window whether the word is on the list or not
            JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
        }
    } //main

    public static boolean wordIsThere(String findMe, String[] theList) {
        // Search array for word
        for (String word : theList) {
            if (word.equals(findMe)) {
                return true;
            }
        }
        return false;
    } // wordIsThere
} // class Main