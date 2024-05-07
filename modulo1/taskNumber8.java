import java.util.Scanner;

public class taskNumber8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Seleziona figura geometrica, 0 per calcolare l'area di un triangolo e 1 per l'area di un quadrato: ");

        int userChoice = scanner.nextInt();

        if (userChoice == 0) {

            System.out.println("Stai calcolando l'area di un triangolo");

            System.out.print("Inserisci la base del triangolo: ");
            float baseOfTriangle = scanner.nextInt();

            System.out.print("Inserisci l'altezza del triangolo: ");
            float heightOfTriangle = scanner.nextInt();

            float areaOfTriangle = (baseOfTriangle * heightOfTriangle) / 2;

            System.out.println("L'area del triangolo é: " + areaOfTriangle);

        } else if (userChoice == 1) {

            System.out.println("Stai calcolando l'area di un quadrato");

            System.out.print("Inserisci un lato del quadrato: ");
            float side = scanner.nextInt();

            float areaOfSquare = (side * side);

            System.out.println("L'area del quadrato é: " + areaOfSquare);
        } else {
            System.out.println("Selezione una figura geometrica esistente!");
        }
    }
}

// Esercizio 8
// Scrivi un programma Java che chieda all'utente di scegliere tra due numeri (0
// per calcolare l'area di un triangolo e 1 per l'area di un quadrato) e, in
// base a quale figura geometrica ha scelto, chiedere i dati mancanti e stampare
// l'area della figura geometrica richiesta.