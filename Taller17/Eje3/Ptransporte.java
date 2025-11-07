abstract class Transporte {
    protected String nombre;
    public Transporte(String nombre) {
        this.nombre = nombre;
    }
    public abstract void mover();
    public String getNombre() {
        return nombre;
    }
}

class Bicicleta extends Transporte {
    public Bicicleta(String nombre) {
        super(nombre);
    }
    @Override
    public void mover() {
        System.out.println(nombre + " se esta moviendo.");
    }
}

class Coche extends Transporte {
    public Coche(String nombre) {
        super(nombre);
    }
    @Override
    public void mover() {
        System.out.println(nombre + " se esta moviendo.");
    }
}

public class Ptransporte {
    public static void main(String[] args) {
        Transporte b1 = new Bicicleta("La bicicleta");
        Transporte c1 = new Coche("El cohe");
        b1.mover();
        c1.mover();
    }
}