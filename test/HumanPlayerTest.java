import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;

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
    public void getName2() {
    // Simular entrada del nombre de usuario
    String simulatedName = "Andrea";
    ByteArrayInputStream testInput = new ByteArrayInputStream(simulatedName.getBytes());
    System.setIn(testInput);

    // Instanciar y ejecutar método
    HumanPlayer humanPlayer = new HumanPlayer();
    String name = humanPlayer.getName();

    // Verificar y comparar resultado
    assertEquals("Andrea", name);
    }
}
