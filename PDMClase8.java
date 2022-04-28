
package pdmclase8;


public class PDMClase8 {

  
    public static void main(String[] args) {
        Perro perro1 = new Perro(5, "Firulais", "Siberiano", "macho", 0.8);
        
        System.out.println("El perro 1, tiene el nombre de "+perro1.getNombre());
        perro1.dormir();
        //System.out.println("El perro 1 esta: "+perro1.dormir());
        
        Perro perro2 = new Perro(2, "Cachuchin");
        perro2.ladrar();
        
        System.out.println("La edad del perro 2 es: "+perro2.getEdad()+" años");
    }
    
}
