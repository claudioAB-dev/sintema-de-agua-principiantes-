package javawater1.pkg1;
import java.util.Scanner;
public class JavaWater11 {
    public static void main(String[] args) {
        //declaracion de variables
        int cuantoHay;//esta muestra cuantos litros hay actualmente
        int desicion1;//esta escoje que quieres hacer
        int aguaAgregada;//esta dice cuanta agua agrege
        int aguaConsumida;//esta dice cuanta agua fue consumida 
    
        //declaramos el scanner
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        
        //aqua empieza el programa de consola 
        System.out.println("vamos a empezar");
        System.out.println("ingresa los litros de agua que hay actualmente");
        cuantoHay = scanner3.nextInt();
        
       do{//en el metemos todo lo que se va a estar repitiendo 
        System.out.println("ingresa 1 si usaste agua o 2 si agregaste mas agua");//primer mensaje
        System.out.println("presiona 3 para conocer la cantidad de agua actual");
        System.out.println("o presiona 0 para cerrar el programa");
        desicion1 = scanner.nextInt();
       
        
        //switchs de 1 o 2
       
        switch (desicion1) {
            case 1 -> {
                System.out.println("cuantos litros agragaste");
                aguaConsumida = scanner4.nextInt();
                cuantoHay = cuantoHay - aguaConsumida;
                System.out.println(cuantoHay + " litros");

            }
            case 2 -> {
                System.out.println("cuantos litros agregaste");
                aguaAgregada = scanner2.nextInt();
                cuantoHay = aguaAgregada + cuantoHay;
                System.out.println(cuantoHay + " litros");

            }
            case 3 ->{
                System.out.println(cuantoHay + " litros");
            }
            default -> System.out.println("error "+ desicion1 + " no se reconoce como un comando interno");
        }   
    
       }//acaba el do
       
       while(desicion1!=0);//si en desicion 1 damos 0 el programa termina
   
    }   
}