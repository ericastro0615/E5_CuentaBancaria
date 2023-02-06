package Entidades;

public class CuentaClass {
    private int numeroCuenta  = (int) (Math.random()*100005);
    private long dni;
    private int saldoActual;
    private String nombre;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre!=null)
        this.nombre = nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        if (dni>1111111){
        this.dni = dni;}

    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        if (saldoActual>5)
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaClass{" +
                "numeroCuenta=" + numeroCuenta +
                ", dni=" + dni +
                ", saldoActual=" + saldoActual +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
