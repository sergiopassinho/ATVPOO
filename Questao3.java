import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Questao3 {
    private static Scanner sc = new Scanner(System.in);
    private static int numPessoas;
    private static LinkedHashSet<Pessoa> pessoas = new LinkedHashSet<Pessoa>();

    private static void lenPessoas() throws InputMismatchException, NullPointerException {

        for (int x = 0; x < 1; x++) {
            try {
                System.out.println("Digite a quantidade de registros: ");
                numPessoas = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Este valor deve ser um inteiro!");
                x -= 1;
            }
            sc.nextLine();
        }
    }

    private static Pessoa salvaNome(int i, Pessoa pessoa) throws InputMismatchException {
        System.out.println("Digite o nome " + (i + 1));
        pessoa.setNome(sc.nextLine());
        return pessoa;
    }

    private static Pessoa salvaIdade(int i, Pessoa pessoa) throws InputMismatchException {
        System.out.println("Digite a idade " + (i + 1));
        pessoa.setIdade(sc.nextInt());
        return pessoa;
    }

    private static Pessoa salvaCpf(int i, Pessoa pessoa) throws InputMismatchException {
        System.out.println("Digite o cpf " + (i + 1));
        pessoa.setCpf(sc.nextInt());
        return pessoa;
    }

    private static boolean verificaCpf(Pessoa pessoa) {
        boolean cpfContain = true;

        Iterator<Pessoa> pessoasAsIterator = pessoas.iterator();
        if (pessoas.size() == 0) {
            cpfContain = false;
        } else {
            while (pessoasAsIterator.hasNext()) {
                Pessoa p = pessoasAsIterator.next();
                if (p.getCpf() == pessoa.getCpf()) {
                    cpfContain = true;
                } else {
                    cpfContain = false;
                }
            }
        }
        return cpfContain;
    }

    public static void main(String args[]) {

        lenPessoas();

        for (int i = 0; i < numPessoas; i++) {
            Pessoa pessoa = new Pessoa();
            try {
                salvaCpf(i, salvaIdade(i, salvaNome(i, pessoa)));

                if (verificarCpf(pessoa)) {
                    System.out.println("Cpf já cadastrado");
                    System.out.println("  ");
                    System.out.println("Insira novamente os dados");
                    i -= 1;
                } else {
                    pessoas.add(pessoa);
                }

            } catch (InputMismatchException e) {
                System.out.println("Dados inválidos, insira novamente");
                i -= 1;
            }
            sc.nextLine();
        }

        Iterator<Pessoa> pessoasAsIterator = pessoas.iterator();
        while (pessoasAsIterator.hasNext()) {
            Pessoa p = pessoasAsIterator.next();
            System.out.println(p.getNome());
            System.out.println(p.getIdade());
            if (p.getCpf() != 0) {
                System.out.println(p.getCpf());
            } else {
                System.out.println("vazio");
            }

        }
    }

}