import java.util.Scanner;

public class taskNumber18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++)
            sum = sum + i;

        System.out.println("La somma dei numeri naturali é uguale a: " + sum);
    }
}

// Esercizio 18
// Scrivi un programma in Java per visualizzare i primi n numeri naturali e la
// loro somma. n è preso in input