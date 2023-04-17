import javax.swing.*;

public class Project0 {
    public static void main(String[] args) {
        String userString;

        while (true) {
            // terminate when user clicks 'cancel' or types 'stop'
            userString = JOptionPane.showInputDialog("Please enter a sentence.");
            if (userString == null || userString.equalsIgnoreCase("STOP")) {
                System.exit(0);
            }

            int lowercaseCount = 0;
            int uppercaseCount = 0;
            for (int i = 0; i < userString.length(); i++) {
                char nextChar = userString.charAt(i);
                if (Character.isLetter(nextChar)) {
                    if (nextChar == 'e') {
                        lowercaseCount++;
                    }
                    if (nextChar == 'E') {
                        uppercaseCount++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Number of lower case e's: " + lowercaseCount
                    + "\nNumber of upper case e's: " + uppercaseCount, "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
