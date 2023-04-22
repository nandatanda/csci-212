import javax.swing.*;
import java.awt.*;

public class RomanNumeralGUI extends JFrame {

    private final JTextArea romanTextArea = new JTextArea();
    private final JTextArea arabicTextArea = new JTextArea();
    private final JTextArea sortedArabicTextArea = new JTextArea();
    private final JMenuBar menuBar = new JMenuBar();

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

        // Create and set the layout of the content pane
        JPanel contentPane = (JPanel) getContentPane();
        contentPane.setLayout(new GridLayout(1, 3));

        // Add text areas to the content pane
        contentPane.add(romanTextArea);
        contentPane.add(arabicTextArea);
        contentPane.add(sortedArabicTextArea);
    }

    public void setRomanText(String s) {
        romanTextArea.setText(s);
    }

    public void setArabicText(String s) {
        arabicTextArea.setText(s);
    }

    public void setSortedArabicText(String s) {
        sortedArabicTextArea.setText(s);
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