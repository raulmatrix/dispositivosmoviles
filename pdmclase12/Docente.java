
package pdmclase12;

public class Docente extends Persona{
    String materias;
    int cantHoras;
    double pagoHora;

    public Docente(String materias, int cantHoras, double pagoHora, String nombre, String apellido, int carnet, int edad, String sexo) {
        super(nombre, apellido, carnet, edad, sexo);
        this.materias = materias;
        this.cantHoras = cantHoras;
        this.pagoHora = pagoHora;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }
    
    public double calcularSueldo(){
        return cantHoras*pagoHora;
    }
    
    
    
    
}
