
package pdmclase3;

public class PDMClase3 {

    
    public static void main(String[] args) {
        /*boolean x,y,z;
        x=true;
        y=false;
        z=true;
        
        //a
        System.out.println((x && y) || (x && z));
        //b
        System.out.println((x || !y)&& (!x || z));
        //d
        System.out.println(!(x || y) && z);
        //f
        System.out.println(!x || !y || z && x && !y);
        */
        /*ejercicio 2*/
        /*boolean w,x,y,z;
        w=false; x=true;
        y=true;z=false;
        
        //c
        System.out.println(!(w || !y) && x || z);
        
        //d
        System.out.println(x && y && w || z || x);
        
        //ejercicio 3
        int valor=0;
        valor=23;
        valor+=10; //valor = valor+10;
        //valor=33;
        System.out.println("Resultado a="+ --valor);//32
        System.out.println("Resultado b="+ ++valor);//33
        System.out.println("Resultado c="+ valor++);//33
        System.out.println("Resultado d="+ valor--);//(33+1)34
        System.out.println("Resultado e="+ valor);//33
        */
        
        //ejercio 4
        //leche
        int cantidad=3;
        int unidades=12;
        double precio=5.4;
        
        double importe;
        double total;
        double iva;
        
        importe = cantidad*unidades*precio;
        total = importe*1.21;
        iva = importe*0.21;
        
        System.out.println("----Factura----");
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Unidades:"+unidades);
        System.out.println("Precio:"+precio);
        
        System.out.println("Total 1: "+total);
        System.out.println("Total 2: "+(importe+iva));
        
        
        
        
        
        
        
        
        
        
    }
    
}
