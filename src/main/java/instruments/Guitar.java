package instruments;

public class Guitar extends Instrument{

        public Guitar (String instrumentName, String instrumentType, Instrument instrument) {
            super(instrumentName, instrumentType);

        }

        public String play() {
            return "Sad guitar noises";
        }
}