class CasaCadastro {

    String endereco;
    double preco;
    String tipo;
    double area;

    public CasaCadastro() {
    }

    public CasaCadastro(
            String endereco,
            double preco,
            String tipo,
            double area
    ) {
        this.endereco = endereco;
        this.preco = preco;
        this.tipo = tipo;
        this.area = area;
    }
}

public class CadastroCasa {

    public static void main(String[] args) {

        CasaCadastro casa1 = new CasaCadastro();

        CasaCadastro casa2 = new CasaCadastro(
                "Rua das Flores, 100",
                450000.00,
                "Sobrado",
                150.0
        );

        System.out.println(
                "Casa 1 criada com construtor vazio."
        );

        System.out.println(
                "Casa 2: " +
                        casa2.endereco +
                        ", " +
                        casa2.tipo +
                        ", R$ " +
                        casa2.preco +
                        ", " +
                        casa2.area +
                        " m²"
        );
    }
}
