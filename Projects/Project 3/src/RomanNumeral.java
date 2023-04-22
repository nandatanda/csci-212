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

    public void setNumeral(String s) {
        numeral = s;
        value = valueOf(s);
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return Integer.toString(value);
    }

    public boolean equals(RomanNumeral r) {
        return value == r.getValue();
    }

    public static int valueOf(String s) {
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
