package instruments;

public abstract class Instrument {

    private String instrumentName;
    private String instrumentType;

    public Instrument(String instrumentName, String instrumentType) {
        this.instrumentName = instrumentName;
        this.instrumentType = instrumentType;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }
}
