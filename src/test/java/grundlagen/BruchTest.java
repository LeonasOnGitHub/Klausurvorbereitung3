package grundlagen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BruchTest {
    @Test
    public void testBruch(){
        Bruch b  = new Bruch(10, 5);
        b.kuerzen();

        Assertions.assertEquals(2, b.getNenner());
        Assertions.assertEquals(1, b.getZaehler());
    }
}
