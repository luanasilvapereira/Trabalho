public class CalculadoraFinanceira {

    public void calcularDesconto(
            double valorTotal,
            double percentualDesconto
    ) {

        double valorFinal =
                valorTotal -
                        (valorTotal * percentualDesconto / 100);

        System.out.printf(
                "Valor final: R$ %.2f%n",
                valorFinal
        );
    }

    public void calcularDesconto(
            double valorTotal,
            double percentualDesconto,
            int parcelas
    ) {

        double valorFinal =
                valorTotal -
                        (valorTotal * percentualDesconto / 100);

        double valorParcela =
                valorFinal / parcelas;

        System.out.printf(
                "Valor final: R$ %.2f%n",
                valorFinal
        );

        System.out.printf(
                "Valor de cada parcela: R$ %.2f%n",
                valorParcela
        );
    }

    public static void main(String[] args) {

        CalculadoraFinanceira calculadora =
                new CalculadoraFinanceira();

        System.out.println("Cálculo sem parcelas:");

        calculadora.calcularDesconto(
                1000.00,
                10
        );

        System.out.println();

        System.out.println("Cálculo com parcelas:");

        calculadora.calcularDesconto(
                1000.00,
                10,
                3
        );
    }
}
