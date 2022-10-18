package ejercicios;

import java.util.Scanner;

/**
 * las pruebas realizadas son:
 * para comprobar el rango
 * -4
 * 15998
 * para comprobar una cifra
 * 5
 * para comprobar dos cifras
 * 44
 * 69
 * para comprobar tres cifras
 * 454
 * 126
 * para comprobar cuatro cifras
 * 1221
 * 1231
 * 1234
 * en todos los casos el programa funciona correctamente
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        //declaramos las variables
        int numero, //se guardara el numero introducido por el usuario
                //variables para guardar cada cifra y poderlas comparar
                primero,
                segundo,
                tercero,
                cuarto;

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
            primero=numero/10; //cogemos las decenas
            segundo=numero%10; //cogemos las unidades
            if (primero==segundo){
                System.out.println("El numero es capicuo.");
            }else {
                System.out.println("El numero no es capicuo.");
            }
        } else if (numero>=100&&numero<1000) {
            //tiene tres cifras
            tercero=numero%10; //cogemos las unidades
            primero=numero/100;//cogemos las centenas
            if (primero==tercero){
                System.out.println("El numero es capicuo.");
            }else{
                System.out.println("El numero no es capicuo.");
            }
        }else{
            //tiene cuatro cifras
            cuarto=numero%10;//cogemos las unidades
            tercero=(numero/10)%10;//cogemos las decenas
            segundo=(numero/100)%10;//cogemos las centenas
            primero=numero/1000;//cogemos las unidades de millar
            if (primero==cuarto&&segundo==tercero){
                System.out.println("El numero es capicuo.");
            }else {
                System.out.println("El numero no es capicuo.");
            }
        }
    }
}
