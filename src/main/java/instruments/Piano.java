package instruments;

public class Piano extends Instrument {

    private final Instrument instrument;

    public Piano(String instrumentName, String instrumentType, Instrument instrument) {
        super(instrumentName, instrumentType);
        this.instrument = instrument;

    }

    public String play() {
        return "Sad piano noises";
    }
}