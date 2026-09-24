class PessoaFuncionario {

    String nome;
    int idade;
    String email;

    public PessoaFuncionario(
            String nome,
            int idade,
            String email
    ) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
}

class FuncionarioCadastro extends PessoaFuncionario {

    double salario;
    String cargo;
    String departamento;
    boolean aprendiz;

    public FuncionarioCadastro(
            String nome,
            int idade,
            String email,
            double salario,
            String cargo,
            String departamento
    ) {

        super(nome, idade, email);

        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;

        if (idade <= 16) {
            aprendiz = true;
        } else {
            aprendiz = false;
        }
    }
}

public class CadastroFuncionario {

    public static void main(String[] args) {

        FuncionarioCadastro funcionario =
                new FuncionarioCadastro(
                        "Ana",
                        16,
                        "ana@email.com",
                        1500.00,
                        "Auxiliar",
                        "TI"
                );

        System.out.println(
                "Nome: " + funcionario.nome
        );

        System.out.println(
                "Idade: " + funcionario.idade
        );

        System.out.println(
                "E-mail: " + funcionario.email
        );

        System.out.println(
                "Cargo: " + funcionario.cargo
        );

        System.out.println(
                "Departamento: " + funcionario.departamento
        );

        System.out.println(
                "Salário: R$ " + funcionario.salario
        );

        System.out.println(
                "Aprendiz: " + funcionario.aprendiz
        );
    }
}
