import java.util.Scanner;
import java.util.InputMismatchException;

public class HumanPlayer extends Player {
    private static final Scanner scanner = new Scanner(System.in);

    // Constructor
    public HumanPlayer() {
        System.out.println("Bienvenido a 'The Guess Number Game' Adivina un número entre el 1 y el 100.");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Ingresa nombre de Jugador: ");
        this.name = scanner.nextLine();
    }

    @Override
    public int makeGuess() {
        int guess;
        // bucle while que se repite hasta tener entrada válida
        while (true) {
            try {
                System.out.println("Ingresa un número: ");
                guess = scanner.nextInt();
                scanner.nextLine(); // limpiar
                guesses.add(guess);
                return guess;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.nextLine(); // limpiar
            }
        }
    }
}

