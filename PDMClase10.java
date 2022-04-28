
package pdmclase10;


public class PDMClase10 {

   
    public static void main(String[] args) {
       
        //primer objeto Perro
        Perro perro1 = new Perro("Doberman", 4, "Grande", "macho");
        System.out.println("El perro tiene "+perro1.getCantPatas()
                +" patas");
        //segundo objeto Mariposa
        Mariposa mariposa1 = new Mariposa(2, "naranja", 6, "monarca", "hembra");
        System.out.println("La mariposa tiene "+mariposa1.getCantPatas()
                +" patas");
        //tercer objeto Aracnido
        Aracnido aracnido1 = new Aracnido("tarantula", 8, "grande", "macho");
        System.out.println("La araña tiene "+aracnido1.getCantPatas()
                +" patas");
    }
    
}
