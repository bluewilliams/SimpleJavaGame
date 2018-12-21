import com.velsoft.GameLogic;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameLogicTests {

    @Test
    public void testHelloGame() {
        final String expected = "Hello Game";
        final String result = GameLogic.helloGame();
        assertEquals(expected, result);
    }
}

