import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de termos: ");
    int n = scanner.nextInt();

    long a = 0;
    long b = 1;

    for (int i = 0; i < n; i++) {
      System.out.print(a);

      if (i < n - 1) {
        System.out.print(", ");
      }

      long proximo = a + b;
      a = b;
      b = proximo;
    }

    scanner.close();
  }
}
