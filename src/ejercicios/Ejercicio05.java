package ejercicios;

import java.util.Scanner;

/**
 * las pruebas realizadas son las siguientes:
 * 2
 * -487
 * en ambos casos el programa se ejecuta correctamente
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        //declaramos variables
        int numero, valorAbsoluto;
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //pedimos al usuario el numero
        System.out.println("Introduzca un numero: ");
        numero=sc.nextInt();
        //calculamos el valor absoluto
        valorAbsoluto=numero<0 ? numero*(-1) : numero;
        System.out.println("El valor absoluto es "+valorAbsoluto+".");
    }
}
