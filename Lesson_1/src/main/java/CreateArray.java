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

import java.util.Scanner;

public class CreateArray {
    public static void makeArr() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What size array you want create? ");

        int arrSize = scanner.nextInt();
        int[] arrCreated = new int[arrSize];
        int counter = arrCreated.length;

        for (int i = 0; i < arrCreated.length ; i++) {
            System.out.println("Please provide " +counter+ " numbers that will be used to complete the array." );
            int numberToArr = scanner.nextInt();
            arrCreated[i] = numberToArr;
            counter--;
        }
        System.out.println("Average number on array was: " + avgOfArr(arrCreated));
        System.out.println("Highest number on array was: " + highestValue(arrCreated));
    }

    public static int findSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static double avgOfArr(int[] array) {
        int sum = findSum(array);
        return (double) sum/array.length;
    }

    public static int highestValue(int[] array) {
        int max = array[0];
        for (int numbers : array) {
            if(numbers > max){
                max=numbers;
            }
        }
        return max;
    }
}
