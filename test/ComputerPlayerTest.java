import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputerPlayerTest {

    @Test
    void makeGuess() {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        int guess = computerPlayer.makeGuess();

        // Verificar si el rango está dentro de lo esperado) con assertTrue
        assertTrue(guess >= 1 && guess <= 100);
    }
    @Test
    void updateRangeBasedOnHumanGuess() {
        ComputerPlayer computerPlayer = new ComputerPlayer();

        computerPlayer.updateRangeBasedOnHumanGuess(50, true); // Suponemos que el humanPlayer adivinó 50 y es demasiado alto
        assertEquals(49, computerPlayer.maxRange); // El rango máximo debería ajustarse a 49

      computerPlayer.updateRangeBasedOnHumanGuess(30, false); // Suponemos que 30 es demasiado bajo
        assertEquals(31, computerPlayer.minRange); // El rango mínimo debería ajustarse a 31
    }
}