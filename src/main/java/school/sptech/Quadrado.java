package school.sptech;

public class Quadrado extends Figura{

    private Double lado;

    public Quadrado() {
        this.lado = 0.0;
    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override public Double calcularArea() {
        return lado * lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
