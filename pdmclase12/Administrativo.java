
package pdmclase12;

public class Administrativo extends Persona{
    double sueldo;
    String cargo;
    int cantHorasExt;
    double pagoHorasExt;

    public Administrativo(double sueldo, String cargo, int cantHorasExt, double pagoHorasExt, String nombre, String apellido, int carnet, int edad, String sexo) {
        super(nombre, apellido, carnet, edad, sexo);
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.cantHorasExt = cantHorasExt;
        this.pagoHorasExt = pagoHorasExt;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCantHorasExt() {
        return cantHorasExt;
    }

    public void setCantHorasExt(int cantHorasExt) {
        this.cantHorasExt = cantHorasExt;
    }

    public double getPagoHorasExt() {
        return pagoHorasExt;
    }

    public void setPagoHorasExt(double pagoHorasExt) {
        this.pagoHorasExt = pagoHorasExt;
    }
    //estemetodo calcula las horas extra en funcion a lo trabajado fuera de lo normal
    public void incrementarExtras(){
        System.out.println("Total horas Extra: "
                +(cantHorasExt*pagoHorasExt));
    }
    
    //calcularTotalLiquido
    
    public double calcularTotalLiquido(){
        return (cantHorasExt*pagoHorasExt)+sueldo;
    }
    
}
