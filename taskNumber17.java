import java.util.Scanner;

public class taskNumber17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int number = scanner.nextInt();

        System.out.println("I primi 10 numeri naturali sono: ");
        for (int i = 1; i <= number; i++) {
            System.out.println(i + " ");
        }
    }
}
// Esercizio 17
// Scrivi un programma in Java per visualizzare i primi 10 numeri naturali.
