public class taskNumber22 {
    public static void main(String[] args) {

        int[] arrayOfNumbers = { 3, 4, 5, 6, 7, 8 };
        int[] sortedArrayOfNumbers = new int[arrayOfNumbers.length];

        System.out.print("Array non ordinato: ");
        for (int number = 0; number < arrayOfNumbers.length; number++) {
            System.out.print(arrayOfNumbers[number] + " ");
        }

        int positionEvenNumbers = 0;
        for (int number = 0; number < arrayOfNumbers.length; number++)
            if (arrayOfNumbers[number] % 2 == 0) {
                sortedArrayOfNumbers[positionEvenNumbers] = arrayOfNumbers[number];
                positionEvenNumbers++;
            }

        int positionOddNumbers = positionEvenNumbers;
        for (int number = 0; number < arrayOfNumbers.length; number++)
            if (arrayOfNumbers[number] % 2 != 0) {
                sortedArrayOfNumbers[positionOddNumbers] = arrayOfNumbers[number];
                positionOddNumbers++;
            }

        System.out.println("\n");
        System.out.print("Array ordinato: ");
        for (int number = 0; number < arrayOfNumbers.length; number++) {
            System.out.print(sortedArrayOfNumbers[number] + " ");
        }
    }
}

// Esercizio 22
// Scrivere un programma java per separare i numeri pari e dispari di un dato
// array di numeri interi mettre prima tutti i numeri pari e poi i numeri
// dispari