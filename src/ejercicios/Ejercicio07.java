package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //declaramos las variables
        int horas, segundos, minutos;
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //pedimos las horas, minutos y segundos al usuario
        System.out.println("Introduzca las horas: ");
        horas= sc.nextInt();
        System.out.println("Introduzca los minutos: ");
        minutos= sc.nextInt();
        System.out.println("Introduzca los segundos: ");
        segundos= sc.nextInt();
        //comprobamos que se encuentra dentro del rango
        // le sumamos un segundo y lo imprimimos
        if (segundos>59||segundos<0||minutos>59||minutos<0||horas>24||horas<0){
            System.out.println("Ha introducido valores fuera de rango.");
        }else{
            if(segundos==59&&minutos==59&&horas==23){
                segundos=0;
                minutos=0;
                horas=0;
            } else if (segundos==59&&minutos==59) {
                segundos=0;
                minutos=0;
                horas+=1;
            } else if () {
                
            }
        }
    }
}
