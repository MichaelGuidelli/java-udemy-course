import java.util.Scanner;

public class taskNumber14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int rowsNumber = scanner.nextInt();

        for (int i = 1; i <= rowsNumber; i++) {
            for (int j = 1; j <= i; j++)
                System.out.println(j);
            System.out.println();
        }
    }
}

// Esercizio 14
// Scrivre un programma in java per visualizzare il modello come un triangolo ad
// angolo retto con un numero
