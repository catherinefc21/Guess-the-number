import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberGameTest {
    private GuessTheNumberGame game;
    private Player mockedPlayer;

    @BeforeEach
    void setUp() {
        game = new GuessTheNumberGame();
        // Ajustar el número objetivo para realizar las pruebas
        game.targetNumber = 50;
        // Realizar Mock a Player
        mockedPlayer = Mockito.mock(Player.class);
    }

    @Test
    void guessIsCorrect() {
        when(mockedPlayer.makeGuess()).thenReturn(50);
        assertTrue(game.checkGuess(mockedPlayer));
    }

    @Test
    void guessIsTooHigh() {
        when(mockedPlayer.makeGuess()).thenReturn(60);
        assertFalse(game.checkGuess(mockedPlayer));
    }

    @Test
    void guessIsTooLow() {
        when(mockedPlayer.makeGuess()).thenReturn(40);
        assertFalse(game.checkGuess(mockedPlayer));
    }
}
