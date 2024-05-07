public class taskNumber21 {
    public static void main(String[] args) {

        int[] arrayOfNumbers = { 1, 2, 3, 4, 5, 6 };

        int index = arrayOfNumbers.length - 1;
        for (int i = 0; i <= arrayOfNumbers.length / 2; i++) {
            int tmp = arrayOfNumbers[i];
            arrayOfNumbers[i] = arrayOfNumbers[index];
            arrayOfNumbers[index] = tmp;
            index--;
        }

        for (int j = 0; j < arrayOfNumbers.length; j++) {
            System.out.println(arrayOfNumbers[j]);
        }

    }
}

// Esercizio 21
// Scrivere un programma java per invertire un array di numeri interi