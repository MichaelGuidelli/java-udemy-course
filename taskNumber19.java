import java.util.Scanner;

public class taskNumber19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int number = scanner.nextInt();
        int sum = 0;

        System.out.println("Numeri dispari: ");
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("Somma numeri naturali: " + sum);
    }
}

// Esercizi 19
// Scrivi un programma in Java per visualizzare gli n, con n preso in input,
// numeri dispari e la loro somma.