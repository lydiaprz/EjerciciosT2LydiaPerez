package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        //declaramos las variables
        int num1, num2, sumaUser, suma;
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //inicializamos los numeros con numeros aleatorios
        num1=(int) ((Math.random()*99)+1);
        num2=(int) ((Math.random()*99)+1);
        //le pedimos al usuario que calcule e introduzca la suma
        System.out.println("Introduzca la suma de "+num1+" y "+num2+".");
        sumaUser= sc.nextInt();
        //comprobamos el resultado
        suma=num1+num2;
        if (sumaUser==suma){
            System.out.println("La suma es correcta.");
        }else {
            System.out.println("La suma es incorrecta, el resultado es "+suma+".");
        }
    }
}
