class CasaCalculo {
    public double preco;
    public double area;
}

public class CalculoCasa {

    public static void main(String[] args) {

        CasaCalculo casa = new CasaCalculo();

        casa.preco = 350000.00;
        casa.area = 100.0;

        double valorMetroQuadrado = casa.preco / casa.area;

        System.out.printf(
                "Valor do metro quadrado: R$ %.2f%n",
                valorMetroQuadrado
        );
    }
}
