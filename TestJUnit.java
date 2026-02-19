import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestJUnit {

    @Test
    public void testSum(){
        Test t = new Test();
        assertEquals(15, t.sum(10,5));
    }
}

