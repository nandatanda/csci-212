import javax.swing.*;
import java.awt.*;

public class RomanNumeralGUI extends JFrame {

    JTextArea romanNumeralTextArea = new JTextArea();
    JTextArea arabicNumeralUnsortedTextArea = new JTextArea();
    JTextArea arabicNumeralSortedTextArea = new JTextArea();
    JMenuBar menuBar = new JMenuBar();

    public RomanNumeralGUI() {
        // Set default window behavior
        setTitle("Roman Numeral Converter");
        setSize(600, 300);
        setLocation(400, 200);
        setDefaultCloseOperation(RomanNumeralGUI.EXIT_ON_CLOSE);
        setVisible(true);

        // Create menu bar entries
        setJMenuBar(menuBar);
        createFileMenu();
        createConvertMenu();

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

    private void createFileMenu() {
        // Create a submenu for file management
        JMenuItem item;
        JMenu fileMenu = new JMenu("File");
        FileMenuHandler fmh = new FileMenuHandler(this);

        // Add a submenu entry for opening files
        item = new JMenuItem("Open");
        item.addActionListener(fmh);
        fileMenu.add(item);

        // Visually separate the submenu entries
        fileMenu.addSeparator();

        // Add a submenu entry for quitting the program
        item = new JMenuItem("Quit");
        item.addActionListener(fmh);
        fileMenu.add(item);

        // Add the submenu to the frame's menu bar
        menuBar.add(fileMenu);
    }

    private void createConvertMenu() {
        // Create a submenu for numeral conversion
        JMenuItem item;
        JMenu convertMenu = new JMenu("Convert");
        ConvertMenuHandler cmh = new ConvertMenuHandler(this);

        // Add a submenu entry for converting a roman numeral to an arabic value
        item = new JMenuItem("Roman to arabic");
        item.addActionListener(cmh);
        convertMenu.add(item);

        // Add the submenu to the frame's menu bar
        menuBar.add(convertMenu);
    }
}