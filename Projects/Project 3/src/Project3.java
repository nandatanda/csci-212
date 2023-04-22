public class Project3 {

    public static SortedRomanNumeralList sortedList = new SortedRomanNumeralList();
    public static UnsortedRomanNumeralList unsortedList = new UnsortedRomanNumeralList();
    public static String workingDirectory = "input.txt";

    public static void main(String[] args) {
        // Set up GUI window
        RomanNumeralGUI window = new RomanNumeralGUI();

        FileReader file = new FileReader(workingDirectory);

        window.addRomanNumerals(file.toUnsortedRoman());
        window.addUnsortedArabicNumerals(file.toUnsortedArabic());
        window.addSortedArabicNumerals(file.toSortedArabic());

    }
}
