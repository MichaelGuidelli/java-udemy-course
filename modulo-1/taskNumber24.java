public class taskNumber24 {
    public static void main(String[] args) {

        int[] arrayOfNumber = { 1, 1, 2, 3, 4, 5, 6, 7, 8 };

        int firstSmallerNumber = arrayOfNumber[0];
        for (int i = 0; i < arrayOfNumber.length; i++)
            if (arrayOfNumber[i] < firstSmallerNumber)
                firstSmallerNumber = arrayOfNumber[i];

        int secondSmallerNumber = arrayOfNumber[0];
        for (int i = 0; i < arrayOfNumber.length; i++)
            if (arrayOfNumber[i] < secondSmallerNumber && arrayOfNumber[i] != firstSmallerNumber)
                secondSmallerNumber = arrayOfNumber[i];

        System.out.println("Il primo numero piú piccolo é: " + firstSmallerNumber + " Il secondo numero piú piccolo é: "
                + secondSmallerNumber);
    }
}

// Esercizio 24
// Scrivere un programma java per trovare il numero piú piccolo e il secondo piú
// piccolo elemento di un array
