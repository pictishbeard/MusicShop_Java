package instruments;

public class Cello extends Instrument{

    private int celloHeight;

    public Cello (String instrumentName, String instrumentType, int celloHeight) {
        super(instrumentName, instrumentType);
        this.celloHeight = celloHeight;
    }

    public int getCelloHeight() {
        return celloHeight;
    }

    public String play() {
        return "Sad Cello noises";
    }
}
