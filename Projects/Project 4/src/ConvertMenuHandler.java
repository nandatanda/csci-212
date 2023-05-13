import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ConvertMenuHandler is an ActionListener implementation that handles actions for the conversion menu.
 * It listens for events triggered by menu items and performs corresponding actions.
 */
public class ConvertMenuHandler implements ActionListener {
    JFrame jframe;

    /**
     * Constructs a ConvertMenuHandler object with the specified JFrame.
     *
     * @param jf the JFrame associated with the menu handler
     */
    public ConvertMenuHandler(JFrame jf) {
        jframe = jf;
    }

    /**
     * Handles the actionPerformed event triggered by menu items.
     *
     * @param event the ActionEvent object representing the action performed
     */
    public void actionPerformed(ActionEvent event) {
        // Store the latest action
        String menuName = event.getActionCommand();

        // Check if that action was to click the "Roman to arabic" button
        if (menuName.equals("Roman to arabic")) {
            try {
                // Create a Roman numeral object from user input, which we use to convert to an Arabic string
                RomanNumeral r = new RomanNumeral(JOptionPane.showInputDialog("Enter a Roman numeral:"));
                JOptionPane.showMessageDialog(null, "The Roman numeral '" + r.getSymbol() + "' carries the value " + r.getValueString());
            } catch (IllegalRomanNumeralException e) {
                // Inform user of invalid input and print the offending string to the console
                JOptionPane.showMessageDialog(null, "The Roman numeral you entered is invalid");
                System.out.println(e.getMessage());
            }
        }
    }
}
