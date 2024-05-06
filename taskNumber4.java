import java.util.Scanner;

public class taskNumber4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci due numeri");

        System.out.print("Inserisci il primo numero: ");
        float firstNumber = scanner.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        float secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("I numeri sono uguali");
        } else {
            System.out.println("I nuneri sono diversi");
        }
    }
}

// Esercizio 4
// Scrivi un programma Java che prende due numeri da tastiera e stampa “I numeri
// inseriti sono uguali” se i due numeri sono uguali e viceversa stampa “I
// numeri inseriti sono diversi”.