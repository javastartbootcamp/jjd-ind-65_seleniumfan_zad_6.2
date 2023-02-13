package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {
    static double[] createArray(int size, Scanner scanner) {
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + (i + 1) + " element tablicy:");
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    static double sumOfSquares(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += Math.pow(element, 2);
        }
        return sum;
    }
}
