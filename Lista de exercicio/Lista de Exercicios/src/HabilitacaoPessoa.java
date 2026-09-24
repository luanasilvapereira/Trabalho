class PessoaHabilitacao {

    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

public class HabilitacaoPessoa {

    public static void main(String[] args) {

        PessoaHabilitacao pessoa = new PessoaHabilitacao();

        pessoa.setIdade(20);

        if (pessoa.getIdade() >= 18) {
            System.out.println(
                    "A pessoa está apta a tirar a carteira."
            );
        } else {
            System.out.println(
                    "A pessoa ainda não está apta."
            );
        }
    }
}
