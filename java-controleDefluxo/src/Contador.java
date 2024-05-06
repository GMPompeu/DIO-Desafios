import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = terminal.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maio que o primeiro!");
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = segundoParametro - primeiroParametro;

            for (int inicio = 1; inicio <= contagem; inicio++) {
                System.out.println("---");
                System.out.println(inicio);
            }
        }
    }
}
