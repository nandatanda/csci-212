import javax.swing.*;
import java.awt.*;

public class RomanNumeralGUI extends JFrame {

    // Create sub-panels for left and right columns
    JPanel romanNumeralPanel = new JPanel();
    JPanel arabicNumeralPanel = new JPanel();

    public RomanNumeralGUI() {
        // Set the title of the window
        setTitle("Roman Numeral Converter");

        // Set the size of the window
        setSize(500, 300);

        // Set the window to be visible
        setVisible(true);

        JPanel contentPane = (JPanel) getContentPane();

        // Set the layout of the content pane
        contentPane.setLayout(new GridLayout(1, 2));

        JTextArea romanNumeralTextArea = new JTextArea();
        contentPane.add(romanNumeralTextArea);
        romanNumeralTextArea.append("Hello");

        /*
        // Set the layout of each sub-panel
        romanNumeralPanel.setLayout(new GridLayout(0, 1));
        arabicNumeralPanel.setLayout(new GridLayout(0, 1));

        // Add sub-panels to grid content pane
        contentPane.add(romanNumeralPanel);
        contentPane.add(arabicNumeralPanel);
        */
    }


    public void addRomanNumeral(String numeralString) {

        romanNumeralPanel.add(new JTextArea(numeralString));
    }


}