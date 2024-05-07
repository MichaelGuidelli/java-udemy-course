public class taskNumber12 {
    public static void main(String[] args) {

        System.out.println("Numeri divisibili per 3: ");
        for (int number = 1; number < 100 + 1; number++) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("Numeri divisibili per 5: ");
        for (int number = 1; number < 100 + 1; number++) {
            if (number % 5 == 0) {
                System.out.println(number + " ");
            }
        }

        System.out.println("Numeri divisibili per 3 e 5: ");
        for (int number = 1; number < 100 + 1; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " ");
            }
        }
    }
}

// Esercizio 12
// Scrivi un programma java per stampare numeri da 1 a 100 che sono divisibili
// per 3, 5 e per entrambi.
