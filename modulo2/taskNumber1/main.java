import java.util.Scanner;

public class main {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Calculator calculator = new Calculator();

                System.out.println("Inserisci due numeri per eseguire varie operazione matematiche");

                System.out.print("Inserisci il primo numero: ");
                double firstNumberInputted = scanner.nextDouble();

                System.out.print("Inserisci il secondo numero: ");
                double secondNumberInputted = scanner.nextDouble();

                calculator.firstNumber = firstNumberInputted;
                calculator.secondNumber = secondNumberInputted;

                System.out
                                .println("La somma di " + firstNumberInputted + " e " + secondNumberInputted + " é: "
                                                + calculator.sum());

                System.out.println("La sottrazione di " + firstNumberInputted + " e " + secondNumberInputted + " é: "
                                + calculator.subtraction());

                System.out.println("La moltiplicazione di " + firstNumberInputted + " e " + secondNumberInputted + " é "
                                + calculator.multiplication());

                System.out.println(
                                "La divisione di " + firstNumberInputted + " e " + secondNumberInputted + " é: "
                                                + calculator.division());
        }
}

// Esercizio 1
// La classe deve avere i seguenti metodi:
// somma: stampa la somma di a e b;
// moltiplicazione: stampa la moltiplicazione di a e b;
// divisione: stampa la divisione di a e b;
// sottrazione: stampa la sottrazione di a e b;