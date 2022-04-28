package pdmclase12;

public class Estudiante extends Persona {
    int codEst;
    String materias;
    String carrera;

    public Estudiante(int codEst, String materias, String carrera, String nombre, String apellido, int carnet, int edad, String sexo) {
        super(nombre, apellido, carnet, edad, sexo);
        this.codEst = codEst;
        this.materias = materias;
        this.carrera = carrera;
    }

    public int getCodEst() {
        return codEst;
    }

    public void setCodEst(int codEst) {
        this.codEst = codEst;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    
}
