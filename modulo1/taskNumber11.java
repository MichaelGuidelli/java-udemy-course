import java.util.Scanner;

public class taskNumber11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insersci due stringa da unire");

        System.out.print("Inserisci la prima stringa: ");
        String firstString = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String secondString = scanner.nextLine();

        System.out.println("L'unione delle due stringhe é: " + (firstString + " " + secondString));
    }
}

// Esercizio 11
// Scrivere un programma che, prese due stringhe in input, stampi la loro
// unione.
