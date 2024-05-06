import java.util.Scanner;

public class taskNumber5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci tre numeri");

        System.out.print("Inserisci il primo numero: ");
        float firstNumber = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        float secondNumber = scanner.nextInt();

        System.out.print("Inserisci il terzo numero: ");

        float thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Il numero piú grande é: " + firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Il numero piú grande é: " + secondNumber);
        } else {
            System.out.println("Il numero piú grande é: " + thirdNumber);
        }
    }
}

// Esercizio 5
// Scrivi un programma Java che prende tre numeri da tastiera e stampi il
// maggiore.