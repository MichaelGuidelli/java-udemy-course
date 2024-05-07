public class taskNumber23 {
    public static void main(String[] args) {

        int[] arrayOfNumbers = { 11, 2, 3, 5, 6, 8, 22, 3, 4, 5 };

        System.out.println("Array non ordinato: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 2 != 0) {
                for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                    if (arrayOfNumbers[j] % 2 == 0) {
                        int tmp = arrayOfNumbers[i];
                        arrayOfNumbers[i] = arrayOfNumbers[j];
                        arrayOfNumbers[j] = tmp;
                    }
                }
            }
        }

        System.out.println("Array ordinato: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }
}

// Esercizio 23
// Scrivere un programma java per separare i numeri pari e dispari di un dato
// array di numeri interi mettre prima tutti i numeri pari e poi i numeri
// dispari, utilizzando il bubble sort.