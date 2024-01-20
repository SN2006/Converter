package app;

import java.util.Scanner;

public class Main {

    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Converter");

        System.out.print("Enter miles: ");

        // Использовал такую конструкцию, чтобы в независимости от ввода пользователя (например: 1,6 или 1.6) программа выполнялась без ошибок
        double milesToConvert = Double.parseDouble(input.next().replaceAll(",", "."));
        double kilometers = convertMilesToKilometers(milesToConvert);
        System.out.format("%.3f miles = %.3f kilometers\n", milesToConvert, kilometers);
    }

    private static double convertMilesToKilometers(double miles){
        return miles * 1.6;
    }
}
