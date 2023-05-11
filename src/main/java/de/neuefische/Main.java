package de.neuefische;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        Scanner inputDevice = new Scanner(System.in);
        try {
            System.out.println("Please enter the first integer");
            x = inputDevice.nextInt();
            System.out.println("Please enter the second integer");
            y = inputDevice.nextInt();
            System.out.println("Result: " + divide(x, y));
        } catch (InputMismatchException e){
            System.out.println("Error! Please enter an integer");
        }
    }

    public static int divide(int x, int y){
        int result = 0;
        try {
            result = x/y;
            return result;
        } catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        return result;
    }
}