import instruments.Cello;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    private Cello cello;

    @Before
    public void before(){
        cello = new Cello("Cello", "String", 180);
    }

    @Test
    public void guitarHasInstrumentType(){
        assertEquals("String", cello.getInstrumentType());
    }

    @Test
    public void guitarHasNumberOfStrings(){
        assertEquals(180, cello.getCelloHeight());
    }

    @Test
    public void guitarCanPlay(){
        assertEquals("Sad cello noises", cello.play());
    }

}

