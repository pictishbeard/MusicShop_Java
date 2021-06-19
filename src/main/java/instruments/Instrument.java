package instruments;

public abstract class Instrument {

    private String instrumentMaterial;
    private String instrumentType;

    public Instrument(String instrumentName, String instrumentType) {
        this.instrumentMaterial = instrumentName;
        this.instrumentType = instrumentType;
    }

    public String getInstrumentMaterial() {
        return instrumentMaterial;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

}
