public class Project2 {

    public static SortedRomanNumeralList sortedList = new SortedRomanNumeralList();
    public static UnsortedRomanNumeralList unsortedList = new UnsortedRomanNumeralList();

    public static void main(String[] args) {
        String FILENAME = "input.txt";

        // Set up GUI window
        RomanNumeralGUI window = new RomanNumeralGUI();
        window.setLocation(300, 200);
        window.setDefaultCloseOperation(RomanNumeralGUI.EXIT_ON_CLOSE);

        // Create stream from file
        TextFileInput fileInput = new TextFileInput(FILENAME);

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
