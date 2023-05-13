/**
 * FileReader is responsible for reading Roman numeral data from a file and populating sorted and unsorted lists.
 */
public class FileReader {

    private final RomanNumeralTree sortedList = new RomanNumeralTree();
    private final RomanNumeralList unsortedList = new RomanNumeralList();

    /**
     * Constructs a FileReader object and reads Roman numeral data from the specified file.
     *
     * @param filename the name of the file to read from
     */
    FileReader(String filename) {
        // Create stream from file
        TextFileInput fileInput = new TextFileInput(filename);

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

    /**
     * Returns the sorted list of Roman numerals read from the file.
     *
     * @return the sorted list of Roman numerals
     */
    public RomanNumeralTree getSortedList() {
        return sortedList;
    }

    /**
     * Returns the unsorted list of Roman numerals read from the file.
     *
     * @return the unsorted list of Roman numerals
     */
    public RomanNumeralList getUnsortedList() {
        return unsortedList;
    }
}
