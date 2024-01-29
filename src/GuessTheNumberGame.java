import java.util.Random;

public class GuessTheNumberGame {
    Random random = new Random();
    int targetNumber = random.nextInt(100) + 1;

    private Boolean checkGuess(Player player) {

        // Pedir número al jugador
        int numberGuessed = player.makeGuess();
        // Verificar suposición
        if (numberGuessed == targetNumber) {
            System.out.println("¡Felicidades, haz adivinado el número!");
            System.out.println("Historial de suposiciones: " + player.getGuesses());
            System.out.println("Total de suposiciones: " + player.getGuesses().size());
            return true; // El juego ha terminado
        } else if (numberGuessed > targetNumber) {
            System.out.println("Muy alta!");
        } else {
            System.out.println("Muy baja!");
        }

        return false; // El juego continúa
    }

    // Lógica de juego
    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        System.out.println("Bienvenido a 'The Guess Number Game'. Adivina un número entre el 1 y el 100");
        System.out.println();

        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();

        String playerName = humanPlayer.getName();
        String computerName = computerPlayer.getName();

        boolean roundState = false;

        while (true) {
            // Turno del jugador humano
            System.out.println("--- Round: " + playerName + " ---");
            roundState = game.checkGuess(humanPlayer);

            // Terminar el juego si el estado es true
            if (roundState) {
                break;
            }

            // Turno de computer player
            System.out.println("--- Round: " + computerName + " ---");
            roundState = game.checkGuess(computerPlayer);

            // Terminar el juego si el estado es true
            if (roundState) {
                break;
            }
        }
    }
}

// Pendiente: revisar cómo hacerlo en caso de que escriba letras!!!