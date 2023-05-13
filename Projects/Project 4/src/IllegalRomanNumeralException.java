/**
 * Exception thrown to indicate an illegal or invalid Roman numeral.
 * This exception is a subclass of IllegalArgumentException.
 */
public class IllegalRomanNumeralException extends IllegalArgumentException {

    /**
     * Constructs an IllegalRomanNumeralException with the specified error message.
     *
     * @param message the detail message explaining the reason for the exception
     */
    public IllegalRomanNumeralException(String message) {
        super(message);
    }
}