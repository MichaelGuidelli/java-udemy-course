import java.util.Scanner;

public class taskNumber3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci due numeri");

        System.out.print("Inserisci il primo numero: ");
        float firstNumber = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        float secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Il numero piú grande é: " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Il numero piü grande é: " + secondNumber);
        } else {
            System.out.println("I numeri sono uguali");
        }
    }
}

// Esercizio 3
// Scrivi un programma Java che prende due numeri da tastiera e stampa quello
// più grande.
