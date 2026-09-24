import java.util.Scanner;

public class CadastroAcademico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println();
            System.out.println("===== SISTEMA ACADÊMICO =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Sair");

            System.out.print("Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println();
                    System.out.println("=== CADASTRO DE ALUNO ===");

                    System.out.print("Nome: ");
                    String nomeAluno =
                            scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade =
                            scanner.nextInt();

                    System.out.print(
                            "Renda familiar: R$ "
                    );

                    double renda =
                            scanner.nextDouble();

                    System.out.print(
                            "Participa de projeto (true/false): "
                    );

                    boolean projeto =
                            scanner.nextBoolean();

                    scanner.nextLine();

                    if (idade >= 16 && idade <= 99) {

                        System.out.println(
                                "Aluno " +
                                        nomeAluno +
                                        " cadastrado."
                        );

                        if (renda < 1500 || projeto) {

                            System.out.println(
                                    "Recebe auxílio estudantil."
                            );

                        } else {

                            System.out.println(
                                    "Não recebe auxílio estudantil."
                            );
                        }

                    } else {

                        System.out.println(
                                "Idade inválida."
                        );
                    }

                    break;

                case 2:

                    System.out.println();
                    System.out.println(
                            "=== CADASTRO DE PROFESSOR ==="
                    );

                    System.out.print("Nome: ");

                    String nomeProfessor =
                            scanner.nextLine();

                    System.out.print(
                            "Anos de experiência: "
                    );

                    int experiencia =
                            scanner.nextInt();

                    System.out.print(
                            "Tem pós-graduação (true/false): "
                    );

                    boolean pos =
                            scanner.nextBoolean();

                    System.out.print(
                            "É bacharel (true/false): "
                    );

                    boolean bacharel =
                            scanner.nextBoolean();

                    scanner.nextLine();

                    if (
                            experiencia > 2 &&
                                    (pos || bacharel)
                    ) {

                        System.out.println(
                                nomeProfessor +
                                        ": Efetivo"
                        );

                    } else {

                        System.out.println(
                                nomeProfessor +
                                        ": Temporário"
                        );
                    }

                    break;

                case 3:

                    System.out.println(
                            "Sistema encerrado."
                    );

                    break;

                default:

                    System.out.println(
                            "Opção inválida."
                    );
            }

        } while (opcao != 3);

        scanner.close();
    }
}