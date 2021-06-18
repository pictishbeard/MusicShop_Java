package instruments;

public class Cello extends Instrument{

    private final Instrument instrument;

    public Cello (String instrumentName, String instrumentType, Instrument instrument) {
        super(instrumentName, instrumentType);
        this.instrument = instrument;
    }


}
