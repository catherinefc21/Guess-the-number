import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer extends Player {

    @Override
    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }

    @Override
    public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa nombre de Jugador: ");
        name = scanner.nextLine();
        return name;
    }

    @Override
    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
}

