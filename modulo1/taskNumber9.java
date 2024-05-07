import java.util.Scanner;

public class taskNumber9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Inserisci una stringa: ");
        String text = scanner.nextLine();

        System.out.println("La stringa inserita é: " + text);

        System.out.print("Inserisci la posizione numerica del carattere desiderato: ");

        int positionChosen = scanner.nextInt();

        System.out
                .println("Il carattere nella posizione: " + positionChosen + " é: " + text.charAt(positionChosen));
    }
}

// Esercizio 9
// Scrivere un programma che, preso in input da tastiera una stringa e un
// numero, stampa il carattere che si trova nella posizione indicata dal numero
// preso in input.