import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertMenuHandler implements ActionListener {
    JFrame jframe;

    public ConvertMenuHandler(JFrame jf) {
        jframe = jf;
    }

    public void actionPerformed(ActionEvent event) {
        // Store the latest action
        String menuName = event.getActionCommand();

        // Check if that action was to click the "Roman to arabic" button
        if (menuName.equals("Roman to arabic")) {
            try {
                // Create a Roman numeral object from user input, which we use to convert to an Arabic string
                RomanNumeral r = new RomanNumeral(JOptionPane.showInputDialog("Enter a Roman numeral:"));
                JOptionPane.showMessageDialog(null, "The Roman numeral '" + r.getNumeral() + "' carries the value " + r.toArabicString());
            } catch (IllegalRomanNumeralException e) {
                // Inform user of invalid input and print the offending string to the console
                JOptionPane.showMessageDialog(null, "The Roman numeral you entered is invalid");
                System.out.println(e.getMessage());
            }
        }
    }
}