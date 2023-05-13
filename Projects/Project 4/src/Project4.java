/**
 * The main class of Project 4, responsible for initializing and running the Roman Numeral Converter program.
 */
public class Project4 {

    /**
     * The path to the working directory or default file used for input.
     */
    public static String workingDirectory = "input.txt";

    /**
     * The instance of the RomanNumeralGUI class representing the graphical user interface of the program.
     */
    public static RomanNumeralGUI window = new RomanNumeralGUI();

    /**
     * The entry point of the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Read initial information from the default file
        FileReader file = new FileReader(workingDirectory);

        // Populate the GUI with the file's contents
        window.setRomanText(file.getUnsortedList().toRomanString());
        window.setArabicText(file.getSortedList().toArabicString());
    }
}
