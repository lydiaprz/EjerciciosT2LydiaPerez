package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //declaramos las variables
        int dni;
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //pedimos al usuario que introduzca el dni
        System.out.println("Introduzca un dni: ");
        dni= sc.nextInt();
        //comprobamos que el dni es valido y calculamos la letra
        if (dni>99999999){
            System.out.println("El dni debe tener solo 8 digitos.");
        } else{
            switch (dni%23){
                case 0-> System.out.println("La letra es T.");
                case 1-> System.out.println("La letra es R.");
                case 2-> System.out.println("La letra es W.");
                case 3-> System.out.println("La letra es A.");
                case 4-> System.out.println("La letra es G.");
                case 5-> System.out.println("La letra es M.");
                case 6-> System.out.println("La letra es Y.");
                case 7-> System.out.println("La letra es F.");
                case 8-> System.out.println("La letra es P.");
                case 9-> System.out.println("La letra es D.");
                case 10-> System.out.println("La letra es X.");
                case 11-> System.out.println("La letra es B.");
                case 12-> System.out.println("La letra es N.");
                case 13-> System.out.println("La letra es J.");
                case 14-> System.out.println("La letra es Z.");
                case 15-> System.out.println("La letra es S.");
                case 16-> System.out.println("La letra es Q.");
                case 17-> System.out.println("La letra es V.");
                case 18-> System.out.println("La letra es H.");
                case 19-> System.out.println("La letra es L.");
                case 20-> System.out.println("La letra es C.");
                case 21-> System.out.println("La letra es K.");
                case 22-> System.out.println("La letra es E.");
                default -> System.out.println();
            }
        }
    }
}
