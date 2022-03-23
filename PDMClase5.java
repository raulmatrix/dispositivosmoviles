
package pdmclase5;

import java.util.Scanner;

public class PDMClase5 {

    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.println("Escriba un numero...");
        valor=entrada.nextInt();
        System.out.println("El valor ingresado: "
                +valor);*/
        
        //ejercicio 1
        /*int num1=155; int num2=230; int num3=135;
        if((num1>num2)&&(num1>num3)){
            System.out.println("El num1 es mayor");
        }else if((num2>num1)&&(num2>num3)){
            System.out.println("El num2 es mayor");
        }
        else{
            System.out.println("El num3 es mayor");
        }*/
        
        //ejercicio 2
        /*Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.println("Escriba un numero...");
        valor=entrada.nextInt();
        
        if((valor>=1)&&(valor<21)){//rango 1 al 20
            if(valor%2==0){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
        }else{
            System.out.println("rango erroneo");
        }*/
        
        /*Scanner entrada = new Scanner(System.in);
        String texto;
        System.out.println("Escriba un texto...");
        texto=entrada.nextLine();
        System.out.println("El texto ingresado es: "
                +texto);*/
        
        int num1=80; 
        int num2=20;
        String operacion="/";
        
        if(operacion.equals("+")){
            System.out.println("La suma es="+(num1+num2));
        }else if(operacion.equals("-")){
            System.out.println("La resta es="+(num1-num2));
        }else if(operacion.equals("*")){
            System.out.println("La multiplicacion es="+(num1*num2));
        }else{
        System.out.println("La division es="+(num1/num2));
        }
    }
    
}
