abstract class FormaGeometrica {

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}

class Quadrado extends FormaGeometrica {

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class Triangulo extends FormaGeometrica {

    double base;
    double altura;

    double lado1;
    double lado2;
    double lado3;

    public Triangulo(
            double base,
            double altura,
            double lado1,
            double lado2,
            double lado3
    ) {

        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}

class Circulo extends FormaGeometrica {

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

public class FormasGeometricas {

    public static void main(String[] args) {

        FormaGeometrica quadrado =
                new Quadrado(5);

        FormaGeometrica triangulo =
                new Triangulo(
                        6,
                        4,
                        5,
                        5,
                        6
                );

        FormaGeometrica circulo =
                new Circulo(3);

        System.out.printf(
                "Quadrado: área %.2f, perímetro %.2f%n",
                quadrado.calcularArea(),
                quadrado.calcularPerimetro()
        );

        System.out.printf(
                "Triângulo: área %.2f, perímetro %.2f%n",
                triangulo.calcularArea(),
                triangulo.calcularPerimetro()
        );

        System.out.printf(
                "Círculo: área %.2f, perímetro %.2f%n",
                circulo.calcularArea(),
                circulo.calcularPerimetro()
        );
    }
}
