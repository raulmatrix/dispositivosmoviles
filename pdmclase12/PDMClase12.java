
package pdmclase12;

public class PDMClase12 {

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante(123, "WEB I,EDD", "Sistemas Informaticos", "Josue", "Perez", 5963695, 24, "M");
        
        Docente doc1 = new Docente("EDD, WEB I, GSW", 72, 70, "Alicia", "Zeballos", 4563689, 35, "F");
        double sueldoDocente = doc1.getCantHoras()*doc1.getPagoHora();
        System.out.println("El sueldo del docente es: "
                +sueldoDocente);
        
        Docente doc2 = new Docente("WEB I", 72, 70, "Alex", "Contreras", 5689636, 40, "M");
        System.out.println("El sueldo del docente 2: "
                +doc2.calcularSueldo());
        
        Administrativo adm1 = new Administrativo(4000, "Secretaria", 4, 50, "Rocio", "Rojas", 4587896, 36, "F");
        System.out.println("El sueldo de secretaria es: "
                +adm1.getSueldo()+" Bs");
        adm1.incrementarExtras();
        
        System.out.println("El liquido pagable de la secretaria es: "
                +adm1.calcularTotalLiquido());
        
    }
    
}
