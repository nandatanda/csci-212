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
            userEntry = JOptionPane.showInputDialog("Enter a Roman numeral:");
            userValue = RomanNumeral.valueOf(userEntry);
            JOptionPane.showMessageDialog(null, "The Roman numeral '" + userEntry + "' carries the value " + userValue + ".");
        }
    }
}