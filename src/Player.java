import java.util.ArrayList;

public abstract class Player {
    String name;
    protected ArrayList<Integer> guesses;

    public Player() {
        // Inicializa la lista de suposiciones
        guesses = new ArrayList<>();
    }

    public abstract int makeGuess();
    //devuelve el numero de suposición de la jugadora

    public abstract String getName();
    // devuelve el nombre de la jugadora
    public abstract ArrayList<Integer> getGuesses();
    // devuelve el historial de suposiciones de la jugadora

}
