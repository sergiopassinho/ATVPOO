import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {
  static Pessoa[] pessoas = new Pessoa[3];
  static Scanner sc = new Scanner(System.in);

  private static void recebeNome(int i) throws InputMismatchException {
    System.out.println("Insira o nome aqui " + (i + 1));
    pessoas[i].setNome(sc.nextLine());
  }

  private static void recebeIdade(int i) throws InputMismatchException {
    System.out.println("Insira a idade aqui " + (i + 1));
    pessoas[i].setIdade(sc.nextInt());
  }

  private static void recebeCpf(int i) throws InputMismatchException {
    System.out.println("Insira o cpf aqui " + (i + 1));
    pessoas[i].setCpf(sc.nextInt());
  }

  public static void main(String args[]) {

    for (int i = 0; i < 3; i++) {
      pessoas[i] = new Pessoa();

      try {
        recebeNome(i);
        recebeIdade(i);
        recebeCpf(i);

      } catch (InputMismatchException e) {
        System.out.println("Dados inadequados");
        i -= 1;
      }
      sc.nextLine();
    }
    for (int i = 0; i < 3; i++) {
      System.out.println("Nome" + (i + 1) + ":" + pessoas[i].getNome());
      System.out.println("Idade" + (i + 1) + ":" + pessoas[i].getIdade());
      System.out.println("Cpf" + (i + 1) + ":" + pessoas[i].getCpf());

    }
  }

} 