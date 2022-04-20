
package pdmclase10;
//clase padre
public class Animal {
    int cantPatas;
    String tipo;
    String sexo;
    //metodo constructor
    public Animal(int cantPatas, String tipo, String sexo) {
        this.cantPatas = cantPatas;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
