public class Tabuada {

    public void mostrarTabuada(int numero) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(
                    numero + " x " + i + " = " + (numero * i)
            );
        }
    }

    public static void main(String[] args) {

        Tabuada tabuada = new Tabuada();

        tabuada.mostrarTabuada(7);
    }
}
