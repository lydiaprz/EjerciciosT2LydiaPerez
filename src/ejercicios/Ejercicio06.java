package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        //declaramos las variables
        int num1, num2, sumaUser;
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //Inicalizamos las variables con numeros aleatorios
        num1=(int) (Math.random()*99)+1;
        num2=(int) (Math.random()*99)+1;
        //pedimos al usuario que introduzca el resultado de la suma
        System.out.println("Introduzca el resultado de la suma de "+num1+" y "+num2+":");
        sumaUser= sc.nextInt();
        //comprobamos si el resultado esta bien
        if (sumaUser==(num1+num2)){
            System.out.println("El resultado de la suma es correcto.");
        }
        else {
            System.out.println("El resultado de la suma es incorrecto, el correcto es "+(num1+num2)+".");
        }
    }
}
