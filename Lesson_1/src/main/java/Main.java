/*
int size = 5;
int[] numbers = new int[size];

Powyższy kod pozwala na stworzenie tablicy gdzie ilość elementów jest zależna o wartości zmiennej. Wykorzystaj to w poniższym programie:

1. Program powinien poprosić użytkownika o podanie liczby całkowitej.
2. Następnie program powinien stworzyć tablicę po podanym przez użytkownika rozmiarze.
3. Następnie poprosić użytkownika o podanie liczb aby zapełnić nimi tablicę (jeżeli użytkownik w pkt 1 podał liczbę 5 jako rozmiar,
to w pkt 3 oczekujemy że poda 5 liczb i każda z nich zapiszemy w tablicy)
4. Po zakończeniu wpisywania liczb przez użytkownika, program powinien wypisać jaka była średnia liczb wprowadzonych przez użytkownika
oraz wartość maksymalna
 */
public class Main {
    public static void main(String[] args) {
//        GuessNumber guessNumber = new GuessNumber();
//        guessNumber.game();

        CreateArray createArray = new CreateArray();
        createArray.makeArr();
    }
}
