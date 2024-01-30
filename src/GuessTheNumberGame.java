import java.util.Random;

public class GuessTheNumberGame {
    private final int targetNumber;
    private final ComputerPlayer computerPlayer;
    private final HumanPlayer humanPlayer;

    // Constructor
    public GuessTheNumberGame() {
        Random random = new Random();
        this.targetNumber = random.nextInt(100) + 1;
        this.humanPlayer = new HumanPlayer();
        this.computerPlayer = new ComputerPlayer();
    }

    private Boolean checkGuess(Player player) {
        // Pedir número al jugador
        int numberGuessed = player.makeGuess();
        // Verificar suposición
        if (numberGuessed == targetNumber) {
            System.out.println("¡Felicidades " + player.getName() + ", has adivinado el número!");
            System.out.println("Historial de intentos: " + player.getGuesses());
            System.out.println("Total: " + player.getGuesses().size());
            System.out.println("-----------------------------------------------");
            return true; // El juego ha terminado
        } else {
            if (player instanceof HumanPlayer) {
                // Si el jugador es HumanPlayer, actualiza la suposición en ComputerPlayer
                boolean isGuessHigh = numberGuessed > targetNumber;
                computerPlayer.updateRangeBasedOnHumanGuess(numberGuessed, isGuessHigh);
            }

            if (numberGuessed > targetNumber) {
                System.out.println("Muy alta!");
            } else {
                System.out.println("Muy baja!");
            }
            System.out.println("-----------------------------------------------");
            return false; // El juego continúa
        }
    }

    // Lógica de juego
    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();

        while (true) {
            // Turno del jugador humano
            System.out.println("*** Turno de " + game.humanPlayer.getName() + " ***");
            if (game.checkGuess(game.humanPlayer)) {
                break;
            }

            // Turno del jugador computadora
            System.out.println("*** Turno de " + game.computerPlayer.getName() + " ***");
            if (game.checkGuess(game.computerPlayer)) {
                break;
            }
        }
    }
}
