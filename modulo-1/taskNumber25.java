import java.util.Scanner;

public class taskNumber25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int secondNumber = scanner.nextInt();

        int sizeOfArray = 0;
        for (int i = firstNumber; i < secondNumber; i++)
            sizeOfArray++;

        int[] arrayOfNumbers = new int[sizeOfArray];

        int indexOfArray = 0;
        for (int i = firstNumber; i < secondNumber; i++) {
            arrayOfNumbers[indexOfArray] = i;
            indexOfArray++;
        }

        System.out.print("Array ordinato: ");
        for (int i = 0; i < arrayOfNumbers.length; i++)
            System.out.print(arrayOfNumbers[i] + " ");

        System.out.print("Array invertito: ");
        for (int i = arrayOfNumbers.length - 1; i > 0; i--)
            System.out.print(arrayOfNumbers[i] + " ");

    }
}

// Esercizio 25
// Stampare tutti i numeri compresi tra a e b dati da tastiera e dopo averli
// stampati metterli dentro un array e rispamparli al contrario.