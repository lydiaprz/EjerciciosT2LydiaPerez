package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //declaramos las variables
        int numero;

        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //pedimos al usuario el numero
        System.out.println("Introduzca un numero entren 0 y 9999: ");
        numero= sc.nextInt();
        //comprobamos el numero
        if (numero<0||numero>9999){ //si no esta dentro del rango manda un mensaje
            System.out.println("El numero no pertenece al rango.");
        } else if (numero>=0&&numero<10) {
            //tiene una cifra
            System.out.println("El numero es capicuo.");
        } else if (numero>=10&&numero<100) {
            //tiene dos cifras

        } else if (numero>=100&&numero<1000) {
            //tiene tres cifras
        }else{
            //tiene cuatro cifras
        }
    }
}
