
package pdmclase7;

public class PDMClase7 {

    public static void main(String[] args) {
       //fibonacci
       
       int x=0, y=1, z=0; //z la suma de actualizacion de valor
       int tam=5;
       
       for(int i=0;i<tam;i++){
           System.out.print(x+",");
           z=x+y;
           x=y;
           y=z;
       }
       //x=5;
       //y=8;
       //z=8;
       //i=5;
       //resultado 0,1,1,2,3
    }
    
}
