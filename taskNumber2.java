import java.util.Scanner;

public class taskNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci 3 numeri: ");

        System.out.print("Inserisci il primo numero: ");
        float firstNumber = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        float secondNumber = scanner.nextInt();

        System.out.println("Inserisci il terzo numero: ");
        float thirdNumber = scanner.nextInt();

        float averageOfThreeNumbers = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("La media dei tre numeri é: " + averageOfThreeNumbers);
    }
}

// Esercizio 2
// Scrivi un programma che accetta 3 numeri in input e stampa la media dei
// numeri