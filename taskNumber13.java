import java.util.Scanner;

public class taskNumber13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                for (int z = j + 1; z < number; z++) {
                    if (i + j + z == number) {
                        System.out.println(i + "+" + j + "+" + z + "=" + number);
                    }
                }
            }
        }

    }
}

// Esercizio 13
// Scrivere un programma java per trovare tutte le terzine uniche in modo tale
// che la somma di tutti e tre gli elementi [x, y, z(x <= y <= z)] sia uguale a
// un numero specifica