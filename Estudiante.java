
package pdmclase9;

public class Estudiante {
    //atributos(propiedades)
    String nombre;
    String apellido;
    String carrera;
    int edad;
    String sexo;

    public Estudiante(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    public Estudiante(String nomb,String apellido,String carrera){
        nombre=nomb;
        this.apellido=apellido;
        this.carrera=carrera;
    }
    
    
    public Estudiante(String nombre, String apellido, String carrera, int edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    //metodos (acciones)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
