package instruments;

public class Guitar extends Instrument{

        private int guitarStrings;

        public Guitar (String instrumentName, String instrumentType, int guitarStrings) {
            super(instrumentName, instrumentType);
            this.guitarStrings = guitarStrings;

        }

    public int getGuitarStrings() {
        return guitarStrings;
    }

        public String play() {
            return "Sad guitar noises";
        }
}