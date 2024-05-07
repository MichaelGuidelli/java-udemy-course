import java.util.Scanner;

public class taskNumber26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un testo: ");
        String text = scanner.nextLine();

        String[] arrayOfStrings = text.split(" ");

        System.out.println("La penultima parola della frase é: " + arrayOfStrings[arrayOfStrings.length - 2]);
    }
}

// Esercizio 26;
// Scrivi un programma java per trovare la penultima parola di una frase presa
// in input.