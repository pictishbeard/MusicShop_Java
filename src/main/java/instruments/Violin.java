package instruments;

public class Violin extends Instrument {

    private final Instrument instrument;

    public Violin(String instrumentName, String instrumentType, Instrument instrument) {
        super(instrumentName, instrumentType);
        this.instrument = instrument;
    }
}
