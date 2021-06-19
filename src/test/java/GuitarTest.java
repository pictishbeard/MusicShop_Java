import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Guitar", "String", 6);
    }

    @Test
    public void guitarHasInstrumentType(){
        assertEquals("String", guitar.getInstrumentType());
    }

    @Test
    public void guitarHasNumberOfStrings(){
        assertEquals(6, guitar.getGuitarStrings());
    }

    @Test
    public void guitarCanPlay(){
        assertEquals("Sad guitar noises", guitar.play());
    }
}
