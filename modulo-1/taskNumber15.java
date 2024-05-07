public class taskNumber15 {
    public static void main(String[] args) {

        int number = 7;

        for (int i = 0; i <= number; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println(j);
            }
            for (int z = 2; z <= i; z++) {
                System.out.println(z);
            }

            System.out.println("");
        }

        for (int i = number - 1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.println(j);
            }
            for (int z = 2; z <= i; z++) {
                System.out.println(z);
            }
            System.out.println("");
        }
    }
}

// Esercizio 15
// Scrivere un programma java per visualizzare la struttura del rombo numerico