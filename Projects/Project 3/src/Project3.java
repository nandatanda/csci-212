public class Project3 {

    public static String workingDirectory = "input.txt";
    public static  RomanNumeralGUI window = new RomanNumeralGUI();

    public static void main(String[] args) {
        RomanFile file = new RomanFile(workingDirectory);

        window.addRomanNumerals(file.toUnsortedRoman());
        window.setArabicText(file.toUnsortedArabic());
        window.addSortedArabicNumerals(file.toSortedArabic());

    }
}
