import java.util.Scanner;

public class taskNumber20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("il numero é: " + i + " e il cubo di " + i + " é: " + Math.pow(i, 3));
        }
    }
}

// Esercizio 20
// Scrivi un programma in Java per visualizzare il cubo del numero fino a un
// intero preso in input.