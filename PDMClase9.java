
package pdmclase9;


public class PDMClase9 {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Rocio", "Perez Bolaños", "Sistemas Informaticos");
        System.out.println("El estudiante 1 esta en la carrera: "+
                estudiante1.getCarrera());
        
        estudiante1.setCarrera("Contaduria publica");
        System.out.println("El estudiante 1 esta en la carrera: "+
                estudiante1.getCarrera());
    }
    
}
