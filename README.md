# Adivina el Número - Guess the Number

## Índice

- [1. Preámbulo](#1-preámbulo)
- [2. Resumen del Proyecto](#2-resumen-del-proyecto)
- [3. Instrucciones](#3-objetivos-de-aprendizaje)
- [4. Diagrama de Clases](#4-consideraciones-generales)

---


![GUESS THE NUMBER](https://firebasestorage.googleapis.com/v0/b/laboratoria-945ea.appspot.com/o/guess-the-number.png?alt=media)

## 2. Resumen del Proyecto

Es un juego interactivo que se desarrolla en el terminal, donde la jugadora y el
ordenador se turnan para intentar adivinar un número aleatorio entre 1 y 100.
Deben tener en cuenta la tentativa anterior, si fue "muy alta" o "muy baja".

![GUESS THE NUMBER DEMO](https://firebasestorage.googleapis.com/v0/b/laboratoria-945ea.appspot.com/o/guess-the-number-demo.gif?alt=media)

## 3. Instrucciones

 Para comenzar a jugar debes realizar los siguientes pasos 🎲:

1. Clona el repositorio con: git clone 
2. Abre la terminal y navega al directorio del juego. 
3. Compila el código ejecutando el comando javac GuessTheNumberGame.java. 
4. Ejecuta el juego con java GuessTheNumberGame.

### 4. Diagrama de Clases

![Diagrama de Clases](https://firebasestorage.googleapis.com/v0/b/laboratoria-945ea.appspot.com/o/class-diagram.png?alt=media)

#### `GuessTheNumberGame`

**Propósito:**
Maneja la lógica principal, decide qué jugador asume el próximo turno.

**Atributos:**

- `random`: Generador de números aleatorios.
- `targetNumber`: Número aleatorio entre 1 y 100 a adivinar en la partida actual.

**Métodos estáticos (`static`):**

- `main(String[] args)`: Inicia el juego y genera el número aleatorio.
- `checkGuess(Player player)`: Ejecuta un turno, obtiene la suposición
  y evalúa el nuevo estado de la partida.

#### `Player`

**Propósito:**
Representa a una jugadora genérica. Es una clase abstracta.
Define los atributos y métodos que todas las _clases_ de jugadoras deben compartir:

**Atributos:**

- `name`: El nombre de la jugadora.
- `guesses`: El historial de suposiciones de la jugadora.

**Métodos:**

- `makeGuess()`: Devuelve la suposición de la jugadora. Es un método abstracto.
- `getName()`: Devuelve el nombre de la jugadora.
- `getGuesses()`: Devuelve el historial de suposiciones de la jugadora.

#### `HumanPlayer` y `ComputerPlayer` (heredan de `Player`)

**Propósito:**
Representa a las jugadoras _Humana_ y _Computadora_, respectivamente.

**Métodos:**

- `makeGuess()`: Método que cada clase que hereda de `Player` debe implementar.

**Relaciones:**

- La clase `GuessTheNumberGame` interactúa con las clases `HumanPlayer`
  y `ComputerPlayer` para gestionar el juego.
- Tanto la clase `HumanPlayer` como `Computer Player` son subclases de `Player`,
  lo que implica que heredan todas sus propiedades y métodos,
  pero también tienen algunas características adicionales propias.



