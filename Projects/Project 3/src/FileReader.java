public class FileReader {

    private static String FILENAME;
    private static SortedRomanNumeralList sortedList = new SortedRomanNumeralList();
    private static UnsortedRomanNumeralList unsortedList = new UnsortedRomanNumeralList();

    FileReader(String s) {
        FILENAME  = s;

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
    }

    public static SortedRomanNumeralList getSortedList() {
        return sortedList;
    }

    public static UnsortedRomanNumeralList getUnsortedList() {
        return unsortedList;
    }

}
