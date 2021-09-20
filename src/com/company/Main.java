package com.company;
import java.io.*;

public class Main {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Elige que operacion deseas realizar: ");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        int modulo = Integer.parseInt(entrada.readLine());
        System.out.println("Ingrese el primer numero: ");
        double x = Integer.parseInt(entrada.readLine());
        System.out.println("Ingrese el segundo numero: ");
        double y = Integer.parseInt(entrada.readLine());
        switch (modulo) {
            case 1:
                System.out.println("El resultado es: " + (x + y));
                break;

            case 2:
                System.out.println("El resultado es: " + (x - y));
                break;

            case 3:
                System.out.println("El resultado es: " + (x * y));
                break;

            case 4:
                System.out.println("El resultado es: " + (x / y));
                break;
        }
    }
}
