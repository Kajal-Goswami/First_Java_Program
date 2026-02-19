import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestJUnit {

    @Test
    public void testSum(){
        Testing t = new Testing();
        assertEquals(15, t.sum(10,5));
    }
}


