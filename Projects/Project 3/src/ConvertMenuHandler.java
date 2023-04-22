import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertMenuHandler implements ActionListener {
    JFrame jframe;

    public ConvertMenuHandler(JFrame jf) {
        jframe = jf;
    }

    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        String userEntry;
        int userValue;

        // Prompt for a roman numeral, convert to arabic, and display the result
        if (menuName.equals("Roman to arabic")) {
            try {
                RomanNumeral r = new RomanNumeral(JOptionPane.showInputDialog("Enter a Roman numeral:"));
                JOptionPane.showMessageDialog(null, "The Roman numeral '" + r.getNumeral() + "' carries the value " + r.toArabicString());
            } catch (IllegalRomanNumeralException e) {
                JOptionPane.showMessageDialog(null, "The Roman numeral you entered is invalid");
                System.out.println(e.getMessage());
            }
        }
    }
}