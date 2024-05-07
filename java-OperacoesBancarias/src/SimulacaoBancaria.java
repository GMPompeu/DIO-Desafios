import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque < saldo || valorSaque == saldo) {
                        Sacar(saldo, valorSaque);
                        break;
                    }
                    System.out.println("Saldo insuficiente.");
                    break;
                case 3:
                    System.out.println("Saldo atual: "+ saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                   System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    public static void Sacar(double saldo, double valorSaque){
        double saldoAtual = (saldo - valorSaque);
        System.out.println("Saldo atual: "+ saldoAtual);
    }
    
}
