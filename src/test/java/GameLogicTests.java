import com.velsoft.GameLogic;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Here is a suite")
class GameLogicTests {
    @Nested
    class HelloGameTests {
        @Test
        @DisplayName("A test")
        void someTests() {
            assertAll(
            () -> {
                //first test
                final String expected = "Hello Game";
                final String result = GameLogic.helloGame();

                assertEquals(expected, result);
            },
            () -> {
                //second test
                final String notExpected = "Yabba Dabba Doo";
                final String result = GameLogic.helloGame();

                assertNotEquals(notExpected, result);
            });
        }
    }
}

