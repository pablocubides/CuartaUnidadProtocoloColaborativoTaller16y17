class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if(cantidad <= saldo) saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}

class CuentaAhorros extends CuentaBancaria {
    public CuentaAhorros(double saldo) {
        super(saldo);
    }
}

public class Pbanco {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria(1500);
        CuentaAhorros a1 = new CuentaAhorros(3500);

        c1.depositar(200);
        c1.retirar(100);
        System.out.println("Saldo CuentaBancaria: " + c1.getSaldo());

        a1.depositar(300);
        a1.retirar(100);
        System.out.println("Saldo CuentaAhorros: " + a1.getSaldo());
    }   
}