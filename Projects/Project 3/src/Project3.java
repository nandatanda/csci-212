public class Project3 {

    public static String workingDirectory = "input.txt";
    public static  RomanNumeralGUI window = new RomanNumeralGUI();

    public static void main(String[] args) {
        // Read initial information from default file
        FileReader file = new FileReader(workingDirectory);

        // Populate GUI with the file's contents
        window.setRomanText(file.toRomanString());
        window.setArabicText(file.toArabicString());
        window.setSortedArabicText(file.toSortedArabicString());

    }
}
