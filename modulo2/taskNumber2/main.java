import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Operazioni disponibili, 0 per l'area 1 per il perimetro");
        System.out.print("Seleziona quale proprietá vuoi calcolare: ");
        int userChoice = scanner.nextInt();

        if (userChoice == 0) {
            System.out.print("Inserisci la base del rettangolo: ");
            rectangle.baseOfRectangle = scanner.nextDouble();

            System.out.print("Inserisci l'altezza del rettangolo: ");
            rectangle.heightOfRectangle = scanner.nextDouble();

            System.out.println("L'area del rettangolo é: " + rectangle.AreaOfRectangle());

        } else if (userChoice == 1) {
            System.out.print("Inserisci la larghezza del rettangolo: ");
            rectangle.widthOfRectangle = scanner.nextDouble();

            System.out.print("Inserisci la lunghezza del rettangolo: ");
            double lengthOfRectangle = scanner.nextDouble();

            System.out.println("Il perimetro del rettangolo é: " + rectangle.perimeterOfRectangle());
        } else {
            System.out.println("Operazione non disponibile!");
        }
    }
}

// Esercizio 2
// Creare la classe rettangolo con i metodi calcola area e perimetro