import java.util.ArrayList;
import java.util.Random;

public class ComputerPlayer extends Player{
    @Override
    public int makeGuess() {
        System.out.println("Ingresa un número: ");
        Random random = new Random();
        int guess = random.nextInt(100)+1;
        System.out.println(guess);
        guesses.add(guess);
        return guess;
    }

    @Override
    public String getName() {
        name = "Computer Player";
        return name;
    }

    @Override
    public ArrayList<Integer> getGuesses(){
        return guesses;
    }
}
