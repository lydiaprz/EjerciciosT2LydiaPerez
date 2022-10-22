package ejercicios;

import java.util.Scanner;

/**
 * las pruebas realizadas son las siguientes:
 * 300, 2
 * 800, 7
 * 900, 9
 * -800, -7
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        //declaramos las variables
        double km, precio;
        int dias;
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //le pedimos al usuario los km y los dias de estancia
        System.out.println("Introduzca los km que realizara: ");
        km= sc.nextDouble();
        System.out.println("Introduzca los dias: ");
        dias= sc.nextInt();
        //comprobamos que introducen datos correctos y calculamos el
        //precio del billete y el descuento si fuese necesario
        if (km<0||dias<0){
            System.out.println("Usted ha introducido valores incorrectos.");
        } else if (km>=800&&dias>=7) {
            precio=km*2.5;
            precio=precio-(precio*0.3);
            System.out.println("El precio del billete es "+precio+"€.");
        } else {
            precio=km*2.5;
            System.out.println("El precio del billete es "+precio+"€.");
        }

    }
}
