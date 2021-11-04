import java.util.Random;
import java.util.Scanner;

/*
1. Program losuje liczbę z zakresu 0-99.

2. Program wyświetla komunikat z prośbą o rozpoczęcie zgadywania liczby całkowitej z zakresu 0-99

3. Program wczytuje liczbę wpisaną przez użytkownika.

4. Użytkownik powinien mieć maksymalnie 5 prób zgadywania.

5. Zachowanie programu podczas podania niepoprawnej liczby:
- w przypadku podania zbyt dużej liczby wypisać do konsoli: "Your number is GREATER than the one you are trying to guess"
- w przypadku podania zbyt małej liczby wypisać do konsoli: "Your number is LOWER than the one you are trying to guess"
- podać ile prób zostało mu do końca.
- jeżeli nie była to jego ostatnia próba to wypisać tekst: "Please try again"

6. Jeżeli użytkownik zgadł liczbę, program powinien wydrukować tekst "You guessed it!"

7. Jeżeli w ciągu 5 prób nie udało się odgadnąć liczby użytkownik, program ma wydrukować wiadomość:
"Sorry you didn't guess the number, the answer was: "
oraz dopisać do niej jaka była wartość liczby której nie udało się odgadnąć

Podpowiedź:
Aby zakończyć wykonywanie pętli wcześniej niż wskazuje na to jej warunek można się posłużyć poleceniem 'break;'
 */

public class GuessNumber {
    public static void game() {
        int numberToGuess = new Random().nextInt(100);

//        uncomment next line for debug
//        System.out.println("numberToGuess " + numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please guess number from 0 to 99 ");
        int guessNumber = scanner.nextInt();

        for (int i = 4; i > -1; i--) {
            if (i == 0) {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
            } else {
                if (guessNumber > numberToGuess) {
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                    System.out.println("Please try again, you have " + i + " attempts left");
                    guessNumber = scanner.nextInt();
                } else if (guessNumber < numberToGuess) {
                    System.out.println("Your number is LOWER than the one you are trying to guess");
                    System.out.println("Please try again, you have " + i + " attempts left");
                    guessNumber = scanner.nextInt();
                } else {
                    System.out.println("You guessed it!");
                    break;
                }
            }
        }
    }
}
