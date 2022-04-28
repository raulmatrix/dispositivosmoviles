
package pdmclase2;

public class PDMClase2 {

    
    public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 15;
        
        int resultado = numero1 + numero2;
        System.out.println("El resultado es: "+resultado);
        
        //incrementando
        
        resultado++;
        System.out.println("Resultado con incremento: "+resultado);
        
        //operadores de comparacion
        
        System.out.println(" "+(numero1>numero2)); //false
        System.out.println(" "+(numero1<numero2)); //true
        
        /*>= mayor igual
          <= menor igual*/
        System.out.println(" "+(numero1>=numero2)); //false
        System.out.println(" "+(numero1<=numero2)); //true
        
        /*operadores logicos*/
        
        //&&
        
        System.out.println(""+((numero1>=numero2)&&(numero1<=numero2)));
        
        //concatenacion
        
        System.out.println("Texto 1"+ " - "+"texto");
        
    }
    
}
