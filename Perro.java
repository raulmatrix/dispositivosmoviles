
package pdmclase10;


public class Perro extends Animal {
    String raza;

    public Perro(String raza, int cantPatas, String tipo, String sexo) {
        super(cantPatas, tipo, sexo);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
    
    
}
