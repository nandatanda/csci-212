public class Project3 {

    public static String workingDirectory = "input.txt";
    public static  RomanNumeralGUI window = new RomanNumeralGUI();

    public static void main(String[] args) {
        RomanFile file = new RomanFile(workingDirectory);

        window.setRomanText(file.toUnsortedRoman());
        window.setArabicText(file.toUnsortedArabic());
        window.setSortedArabicText(file.toSortedArabic());

    }
}
