import com.velsoft.GameLogic;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class GameLogicTests {

    @Test
    @Tag("GameLogicTests")
    @DisplayName("First cool HelloGame test - testHelloGame")
    public void testHelloGame() {
        final String expected = "Hello Game";
        final String result = GameLogic.helloGame();
        assertEquals(expected, result);
    }
}

