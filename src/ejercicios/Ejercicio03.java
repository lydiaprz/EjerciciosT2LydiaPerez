package ejercicios;

import java.util.Scanner;

/**
 * las pruebas realizadas son las siguientes
 * hoy comida:
 * animales->30
 * comida comprada->25
 * comida->30
 * no hay comida:
 * animales->30
 * comida comprada->30
 * comida->25
 * no hay animales:
 * animales->0
 * comida comprada->25
 * comida->30
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        //declaramos variables
        int animales; //numero de animales
        double comidaComprada, //la comida comprada
                comida; //la comida que consumen en tota
        //declaramos scanner
        Scanner sc=new Scanner(System.in);
        //pedimos al usuario el numero de animales, la comida
        //comprada y la que consumen en total
        System.out.println("Introduzca el numero de animales de la granja: ");
        animales= sc.nextInt();
        System.out.println("Introduzca la cantidad de comida comprada: ");
        comidaComprada=sc.nextDouble();
        System.out.println("Introduzca la cantidad de comida que se consume en total: ");
        comida= sc.nextDouble();
        //comprobamos que hay animales y que disponemos de comida suficiente para ellos
        if (animales<=0){
            System.out.println("No hay animales en la granja.");
        }
        else {
            comidaComprada/=animales;
            comida/=animales;
            if (comidaComprada<=comida){
                System.out.println("Dispone de comida.");
            }else {
                System.out.println("No dispone de comida.");
            }
        }
    }
}
