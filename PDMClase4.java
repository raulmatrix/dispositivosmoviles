package pdmclase4;


public class PDMClase4 {

    
    public static void main(String[] args) {
        
        String nombre = "Raul Vera";
        System.out.println(""+nombre);
        
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        System.out.println("El tamaño del abecedario es: "+abecedario.length());
        
        System.out.println("En mayusucula "+nombre.toUpperCase());
        
        String textoPrueba = "Este es un texto de \"prueba\" para la clase";
        System.out.println(""+textoPrueba);
        
        //estructuras condicionales
        int num1=12;
        int num2=15;
        int num3=20;
        if(num1<num2){
            System.out.println("El numero 1 es el menor");
        }else{
            System.out.println("El numero 2 es el mayor");
        }
        
        //estructura extendida
        
        if(num1<num2){
            //cuerpo1
        } 
        if(num2>=num3){
            //cuerpo2
        }
        if(num3<num1){
            //cuerpo3
        }
        else{
            //codigo por defecto
        }
    }
    
}
