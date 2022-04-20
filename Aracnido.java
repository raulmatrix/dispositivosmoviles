
package pdmclase10;

public class Aracnido extends Animal{
    String especie;
    int tamanio;

    public Aracnido(String especie, int cantPatas, String tipo, String sexo) {
        super(cantPatas, tipo, sexo);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    
    
    
}
