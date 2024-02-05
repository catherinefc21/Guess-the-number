import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class HumanPlayerTest {
    @Test
    public void makeGuess() {

        HumanPlayer humanPlayer = Mockito.mock(HumanPlayer.class);
        when(humanPlayer.makeGuess()).thenReturn(45);
        int guess = humanPlayer.makeGuess();
        assertEquals(45, guess);
    }
    @Test
    public void getName() {
        HumanPlayer humanPlayer = Mockito.mock(HumanPlayer.class);
        when(humanPlayer.getName()).thenReturn("Andrea");
        assertEquals("Andrea", humanPlayer.getName());
    }
}
