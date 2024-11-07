package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura) {
        if (figura == null) {
            return;
        }
        this.figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {

        Double somaTotal = 0.0;

        for (Figura figura : figuras) {
            somaTotal += figura.calcularArea();
        }

        return somaTotal;

    }

    public List<Figura> buscarPorAreaMaiorQue20() {

        List<Figura> figurasMaiorQue20 = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20) {
                figurasMaiorQue20.add(figura);
            }
        }

        return figurasMaiorQue20;
    }

    public List<Figura> buscarQuadrados() {

        List<Figura> quadrados = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                quadrados.add(figura);
            }
        }

        return quadrados;

    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }
}
