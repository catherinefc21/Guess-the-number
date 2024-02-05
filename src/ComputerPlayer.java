import java.util.Random;

public class ComputerPlayer extends Player {
   int minRange = 1;
   int maxRange = 100;
    private final Random random = new Random();

    // Constructor (Asignar el nombre predeterminado)
    public ComputerPlayer() {
        this.name = "Computer Player";
    }

    @Override
    public int makeGuess() {
        int guess;
        do {
            guess = minRange + random.nextInt(maxRange - minRange + 1);
        } while (guesses.contains(guess));

        System.out.println(guess);
        guesses.add(guess);
        return guess;
    }
    // Método para ajustar el rango de números basado en la última suposición del HumanPlayer
    public void updateRangeBasedOnHumanGuess(int humanGuess, boolean isHumanGuessHigh) {
        if (isHumanGuessHigh) {
            maxRange = Math.min(maxRange, humanGuess - 1);
        } else {
            minRange = Math.max(minRange, humanGuess + 1);
        }
    }
}
