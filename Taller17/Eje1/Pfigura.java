abstract class Figura {
    public abstract double calcularArea();
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}

public class Pfigura {
    public static void main(String[] args) {
        Figura f1 = new Circulo(22);
        Figura f2 = new Rectangulo(12, 4);

        System.out.println("El area del circulo es: " + f1.calcularArea());
        System.out.println("El area del rectangulo es: " + f2.calcularArea());
    }
}