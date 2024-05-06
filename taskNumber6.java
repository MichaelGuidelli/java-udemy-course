import java.util.Scanner;

public class taskNumber6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.err.println("Per sapere quanti giorni ha un mese, inserisci il  mese sottoforma di numero:");
        int monthChosen = scanner.nextInt();

        if (monthChosen == 1) {
            System.out.println("Gennaio ha 31 giorni");
        } else if (monthChosen == 2) {
            System.out.println("Febbraio ha 28 giorni");
        } else if (monthChosen == 3) {
            System.out.println("Marzo ha 31 gironi");
        } else if (monthChosen == 4) {
            System.out.println("Aprile ha 30 giorni");
        } else if (monthChosen == 5) {
            System.out.println("Maggio ha 31 giorni");
        } else if (monthChosen == 6) {
            System.out.println("Giugno ha 30 giorni");
        } else if (monthChosen == 7) {
            System.out.println("Luglio ha 31 giorni");
        } else if (monthChosen == 8) {
            System.out.println("Agosto ha 31 giorni");
        } else if (monthChosen == 9) {
            System.out.println("Settembre ha 30 giorni");
        } else if (monthChosen == 10) {
            System.out.println("Ottobre ha 31 giorni");
        } else if (monthChosen == 11) {
            System.out.println("Novembre ha 30 giorni");
        } else if (monthChosen == 12) {
            System.out.println("Dicembre ha 31 giorni");
        } else {
            System.out.println("Inserisci un mese valido tra 1 e 12.");
        }
    }
}

// Esercizio 6
// Scrivi un programma Java che restituisce il numero di giorni di un mese dato
// in input dall’utente. Il mese è dato sotto forma di intero, ad esempio 3
// corrisponde a marzo. Ignorare gli anni bisestili.
