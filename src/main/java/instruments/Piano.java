package instruments;

public class Piano extends Instrument {

    private int numberOfKeys;
    public Piano(String instrumentName, String instrumentType, int numberOfKeys) {
        super(instrumentName, instrumentType);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Sad piano noises";
    }
}