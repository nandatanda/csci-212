import javax.swing.*;
import java.awt.*;

/**
 * RomanNumeralGUI represents the graphical user interface for the Roman Numeral Converter application.
 * It provides a window with text areas to display Roman and Arabic numeral representations,
 * as well as menu options for file management and numeral conversion.
 */
public class RomanNumeralGUI extends JFrame {

    private final JTextArea romanTextArea = new JTextArea();
    private final JTextArea arabicTextArea = new JTextArea();
    private final JMenuBar menuBar = new JMenuBar();

    /**
     * Constructs a RomanNumeralGUI object.
     * Initializes the window, menu bar, and content pane with text areas.
     */
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
        contentPane.setLayout(new GridLayout(1, 2));

        // Add text areas to the content pane
        contentPane.add(romanTextArea);
        contentPane.add(arabicTextArea);
    }

    /**
     * Sets the text of the Roman numeral text area.
     *
     * @param s the text to be displayed in the Roman numeral text area
     */
    public void setRomanText(String s) {
        romanTextArea.setText(s);
    }

    /**
     * Sets the text of the Arabic numeral text area.
     *
     * @param s the text to be displayed in the Arabic numeral text area
     */
    public void setArabicText(String s) {
        arabicTextArea.setText(s);
    }

    /**
     * Creates the file menu with submenu entries for file management.
     * Associates menu items with the FileMenuHandler.
     */
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

    /**
     * Creates the convert menu with submenu entries for numeral conversion.
     * Associates menu items with the ConvertMenuHandler.
     */
    private void createConvertMenu() {
        // Create a submenu for numeral conversion
        JMenuItem item;
        JMenu convertMenu = new JMenu("Convert");
        ConvertMenuHandler cmh = new ConvertMenuHandler(this);

        // Add a submenu entry for converting a Roman numeral to an Arabic value
        item = new JMenuItem("Roman to arabic");
        item.addActionListener(cmh);
        convertMenu.add(item);

        // Add the submenu to the frame's menu bar
        menuBar.add(convertMenu);
    }
}