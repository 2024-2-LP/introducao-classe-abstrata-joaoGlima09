package school.sptech;

public class Circulo extends Figura {
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Circulo() {
        this.raio = 0.0;
    }

    @Override public Double calcularArea() {
        return Math.PI * raio * raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
