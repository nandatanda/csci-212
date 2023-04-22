public class Project3 {

    public static SortedRomanNumeralList sortedList = new SortedRomanNumeralList();
    public static UnsortedRomanNumeralList unsortedList = new UnsortedRomanNumeralList();
    public static String workingDirectory = "input.txt";

    public static void main(String[] args) {
        // Set up GUI window
        RomanNumeralGUI window = new RomanNumeralGUI();

        // Create stream from file
        TextFileInput fileInput = new TextFileInput(workingDirectory);

        while (true) {
            // Get entire line of text file
            String line = fileInput.readLine();

            // Stop reading if end of file
            if (line == null) {
                break;
            }

            // Split line into individual numerals
            String[] separatedLine = line.split(",");

            // Add each numeral to sorted and unsorted lists
            for (String term : separatedLine) {
                RomanNumeral numeral = new RomanNumeral(term);
                sortedList.add(numeral);
                unsortedList.append(numeral);
            }
        }
        // Finish reading from file
        fileInput.close();

        // Loop through unsorted values
        RomanNumeralListIterator i = unsortedList.reset();
        while (i.hasNext()) {
            RomanNumeral numeral = i.next();
            String roman = numeral.getNumeral();
            int value = numeral.getValue();

            // Add to RomanNumeralGUI Unsorted Text Areas
            window.addRomanNumeral(roman);
            window.addUnsortedArabicNumeral(value);
        }

        // Loop through sorted values
        i = sortedList.reset();
        while (i.hasNext()) {
            RomanNumeral numeral = i.next();
            int value = numeral.getValue();

            // Add to RomanNumeralGUI Sorted Text Area
            window.addSortedArabicNumeral(value);
        }
    }
}
