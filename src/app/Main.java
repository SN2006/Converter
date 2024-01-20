package app;

import java.util.Scanner;

public class Main {

    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Converter");

        System.out.print("Enter kilometers: ");

        double kilometersToConvert = Double.parseDouble(input.next().replaceAll(",", "."));
        double miles = convertKilometersToMiles(kilometersToConvert);
        System.out.format("%.3f kilometers = %.3f miles\n", kilometersToConvert, miles);
    }

    private static double convertKilometersToMiles(double kilometers){
        return kilometers / 1.6;
    }

}
