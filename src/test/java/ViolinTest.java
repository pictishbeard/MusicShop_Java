import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    private Violin violin;

    @Before
    public void before(){
        violin = new Violin("Violin", "String", 5);
    }

    @Test
    public void violinHasInstrumentType(){
        assertEquals("String", violin.getInstrumentType());
    }

    @Test
    public void violinHasNumberOfStrings(){
        assertEquals(5, violin.getViolinStrings());
    }

    @Test
    public void violinCanPlay(){
        assertEquals("Sad violin noises", violin.play());
    }
}