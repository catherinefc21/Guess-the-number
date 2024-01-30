import java.util.ArrayList;

public abstract class Player {
    String name;
    protected ArrayList<Integer> guesses;

    //Constructor
    public Player() {
        // Inicializa la lista de suposiciones
        guesses = new ArrayList<>();
    }

    public abstract int makeGuess();
    //devuelve el numero de suposición de la jugadora

    public String getName(){
        // Implementación del método getName
        return name;
    }
    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
    // devuelve el historial de suposiciones de la jugadora

}
