import java.util.Scanner;

public class taskNumber7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcola l'area di un triangolo inserendo la base e l'altezza");

        System.out.print("Inserisci la base del triangolo: ");
        float baseOfTriangle = scanner.nextInt();

        System.out.print("Inserisci l'altezza del triangolo: ");
        float heightOfTriangle = scanner.nextInt();

        float areaOfTriangle = (baseOfTriangle * heightOfTriangle) / 2;

        System.out.println("L'area del triangolo é: " + areaOfTriangle);
    }
}

// Esercizio 7
// Scrivi un programma Java che, dati in input da tastiera due numeri che
// rappresentano base e altezza, stampi il valore dell'area di un triangolo
// (base*altezza/2)