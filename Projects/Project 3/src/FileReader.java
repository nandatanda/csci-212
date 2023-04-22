public class FileReader {

    private static SortedRomanNumeralList sortedList = new SortedRomanNumeralList();
    private static UnsortedRomanNumeralList unsortedList = new UnsortedRomanNumeralList();

    FileReader(String s) {

        // Create stream from file
        TextFileInput fileInput = new TextFileInput(s);

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

    public String toUnsortedRoman() {
        String result = "";
        RomanNumeralListIterator i = unsortedList.reset();
        while (i.hasNext()) {
            if (!result.equals("")) {
                result += "\n";
            }
            RomanNumeral numeral = i.next();
            String roman = numeral.getNumeral();
            result += roman;
        }
        return result;
    }

    public String toSortedRoman() {
        String result = "";
        RomanNumeralListIterator i = sortedList.reset();
        while (i.hasNext()) {
            if (!result.equals("")) {
                result += "\n";
            }
            RomanNumeral numeral = i.next();
            String roman = numeral.getNumeral();
            result += roman;
        }
        return result;
    }

    public String toSortedArabic() {
        String result = "";
        // Loop through sorted values
        RomanNumeralListIterator i = sortedList.reset();
        while (i.hasNext()) {
            if (!result.equals("")) {
                result += "\n";
            }
            RomanNumeral numeral = i.next();
            String arabic = numeral.toString();
            result += arabic;
        }
        return result;
    }

    public String toUnsortedArabic() {
        String result = "";
        // Loop through sorted values
        RomanNumeralListIterator i = unsortedList.reset();
        while (i.hasNext()) {
            if (!result.equals("")) {
                result += "\n";
            }
            RomanNumeral numeral = i.next();
            String arabic = numeral.toString();
            result += arabic;
        }
        return result;
    }

    public SortedRomanNumeralList getSortedList() {
        return sortedList;
    }

    public UnsortedRomanNumeralList getUnsortedList() {
        return unsortedList;
    }

}
