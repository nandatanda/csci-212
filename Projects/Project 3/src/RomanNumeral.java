public class RomanNumeral {

    private String numeral;
    private int value;

    public RomanNumeral(String numeral) {
        this.numeral = numeral;
        this.value = valueOf(numeral);
    }

    public String getNumeral() {
        return numeral;
    }

    public int getValue() {
        return value;
    }

    public void setNumeral(String s) {
        numeral = s;
        value = valueOf(s);
    }

    public String toArabicString() {
        // Return the numeral's arabic conversion as a String
        return Integer.toString(value);
    }

    public boolean equals(RomanNumeral r) {
        // Compare the integer value of two RomanNumeral objects
        return value == r.getValue();
    }

    private int valueOf(String s) {
        // Return the integer value of a RomanNumeral
        int result = 0;
        int previousValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value;
            switch (c) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    throw new IllegalRomanNumeralException("Invalid Roman numeral character: " + c);
            }
            if (value < previousValue) {
                result -= value;
            } else {
                result += value;
            }
            previousValue = value;
        }
        return result;
    }
}
