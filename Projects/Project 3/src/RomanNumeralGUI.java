import javax.swing.*;
import java.awt.*;

public class RomanNumeralGUI extends JFrame {

    JTextArea romanNumeralTextArea = new JTextArea();
    JTextArea arabicNumeralUnsortedTextArea = new JTextArea();
    JTextArea arabicNumeralSortedTextArea = new JTextArea();

    public RomanNumeralGUI() {
        // Set the title of the window
        setTitle("Roman Numeral Converter");

        // Set the size of the window
        setSize(600, 300);

        // Set the window to be visible
        setVisible(true);

        JPanel contentPane = (JPanel) getContentPane();

        // Set the layout of the content pane
        contentPane.setLayout(new GridLayout(1, 3));

        // Add text areas to the content pane
        contentPane.add(romanNumeralTextArea);
        contentPane.add(arabicNumeralUnsortedTextArea);
        contentPane.add(arabicNumeralSortedTextArea);
    }

    public void addRomanNumeral(String text) {
        romanNumeralTextArea.append(text + "\n");
    }

    public void addUnsortedArabicNumeral(int number) {
        String text = String.valueOf(number);
        arabicNumeralUnsortedTextArea.append(text + "\n");
    }

    public void addSortedArabicNumeral(int number) {
        String text = String.valueOf(number);
        arabicNumeralSortedTextArea.append(text + "\n");
    }

}