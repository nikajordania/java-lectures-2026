package lecture_4.exceptions.custom;

// Checked exception: extends Exception, so every caller must catch it or declare throws
public class InvalidNumberException extends Exception {

    private final int number;

    public InvalidNumberException(String message, int number) {
        super(message);
        this.number = number;
    }

    // extra data: the number that was rejected
    public int getNumber() {
        return number;
    }
}
