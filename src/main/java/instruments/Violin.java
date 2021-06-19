package instruments;

public class Violin extends Instrument {

    private int violinStrings;
    public Violin(String instrumentName, String instrumentType, int violinStrings) {
        super(instrumentName, instrumentType);
        this.violinStrings = violinStrings;
    }

    public int getViolinStrings() {
        return violinStrings;
    }

    public String play() {
        return "Sad violin noises";
    }
}