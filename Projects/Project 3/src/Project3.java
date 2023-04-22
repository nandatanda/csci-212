public class Project3 {

    public static String workingDirectory = "input.txt";
    public static  RomanNumeralGUI window = new RomanNumeralGUI();

    public static void main(String[] args) {
        FileReader file = new FileReader(workingDirectory);

        window.addRomanNumerals(file.toUnsortedRoman());
        window.addUnsortedArabicNumerals(file.toUnsortedArabic());
        window.addSortedArabicNumerals(file.toSortedArabic());

    }
}
