import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberGameTest {
    @Test
    void checkGuessTrue() {
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.targetNumber = 50;

        Player mockedPlayer = Mockito.mock(Player.class);
        when(mockedPlayer.makeGuess()).thenReturn(50);

        boolean result = game.checkGuess(mockedPlayer);

        assertTrue(result);
    }
}