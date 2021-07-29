package PracticaClase3.Ejercicio1Clase3;

public class CuentaCorriente{

    private double saldo;

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cc) {
        this.saldo = cc.getSaldo();
    }

    public void ingreso(double ingreso){
        this.saldo += ingreso;
    }

    public void egreso(double egreso){
        this.saldo += egreso;
    }

    public void reintegro(double reintegro){
        ingreso(reintegro);
    }

    public void transferencia(CuentaCorriente cc, double monto){
        this.egreso(monto);
        cc.ingreso(monto);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }




}
