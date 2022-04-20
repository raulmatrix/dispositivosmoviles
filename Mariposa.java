
package pdmclase10;


public class Mariposa extends Animal {
    int cantAlas;
    String color;

    public Mariposa(int cantAlas, String color, int cantPatas, String tipo, String sexo) {
        super(cantPatas, tipo, sexo);
        this.cantAlas = cantAlas;
        this.color = color;
    }

    public int getCantAlas() {
        return cantAlas;
    }

    public void setCantAlas(int cantAlas) {
        this.cantAlas = cantAlas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
