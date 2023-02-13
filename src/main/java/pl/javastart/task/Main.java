package pl.javastart.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int size = scanner.nextInt();
        System.out.println("Wprowadź " + size + " liczb:");
        double[] array = ArrayUtils.createArray(size, scanner);
        double sum = ArrayUtils.sumOfSquares(array);
        System.out.println("Suma kwadratów wprowadzonych liczb to " + sum);
    }
}
