package practices_1.taask5;

public class AsciiValur {
    private final char character;
    private final int asciiValue;

    public AsciiValur(char character) {
        this.character = character;
        this.asciiValue = character;
    }

    @Override
    public String toString() {
        return "AsciiValur{" +
                "character=" + character +
                ", asciiValue=" + asciiValue +
                '}';
    }

}
