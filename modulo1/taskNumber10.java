import java.util.Scanner;

public class taskNumber10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String text = scanner.nextLine();

        System.out.print("Inserisci un carattere: ");
        char charChosen = scanner.next().charAt(0);

        System.out.println("La posizione del carattare inserito: " + charChosen + " é: " + text.indexOf(charChosen));
    }
}

// Esercizio 10
// Scrivere un programma che, preso una stringa e un carattere in input, stampi
// la posizione di quel carattere nella stringa.