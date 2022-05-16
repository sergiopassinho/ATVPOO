import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {

    private static Scanner sc = new Scanner(System.in);
    private static int numPessoas;
    private static Pessoa[] pessoas = new Pessoa[numPessoas];

    private static void lenPessoas() throws InputMismatchException, NullPointerException {

        for (int x = 0; x < 1; x++) {
            try {
                System.out.println("Insira o valor da quantidade de registros: ");
                numPessoas = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Este valor deve ser um inteiro!");
                x -= 1;
            }
            sc.nextLine();
        }
    }

    private static void salvaNome(int i) throws InputMismatchException {
        System.out.println("Insira o nome " + (i + 1));
        pessoas[i].setNome(sc.nextLine());
    }

    private static void salvaIdade(int i) throws InputMismatchException {
        System.out.println("Insira a idade " + (i + 1));
        pessoas[i].setIdade(sc.nextInt());
    }

    private static void salvaCpf(int i) throws InputMismatchException {
        System.out.println("Insira o cpf " + (i + 1));
        pessoas[i].setCpf(sc.nextInt());
    }

    public static void main(String args[]) {

        lenPessoas();

        for (int i = 0; i < numPessoas; i++) {
            pessoas[i] = new Pessoa();
            try {
                salvaNome(i);
                salvaIdade(i);
                salvaCpf(i);

            } catch (InputMismatchException e) {
                System.out.println("Insira os dados corretamente.");
                i -= 1;
            }
            sc.nextLine();
        }
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Nome " + (i + 1) + " : " + pessoas[i].getNome());
            System.out.println("Idade " + (i + 1) + " : " + pessoas[i].getIdade());
            System.out.println("Cpf " + (i + 1) + " : " + pessoas[i].getCpf());

        }
    }

} 