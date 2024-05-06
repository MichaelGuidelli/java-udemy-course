import java.util.Scanner;

public class taskNumber16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un nunero per visualizzare la tabelle di moltiplicazione: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++)
            System.out.println(number + " X " + i + " = " + number * i);
    }
}

// Esercizio 16
// Scrivere un programma java per visualizzare la tabella di moltiplicazione di
// un dato numero intero.