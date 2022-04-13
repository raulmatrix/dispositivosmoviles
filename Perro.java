
package pdmclase8;

public class Perro {
    //atributos
    int edad;
    String nombre;
    String raza;
    String sexo;
    double estatura;
    
    //metodo constructor
    
    public Perro(int edad, String nombre, String raza, String sexo, double estatura) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.estatura = estatura;
    }

    public Perro(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    //metodos
    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
    
    public void dormir(){
        System.out.println("El perro esta durmiendo");
    }
    //metodos generados a partir de atributos
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
}
