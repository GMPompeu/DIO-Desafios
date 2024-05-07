import java.util.Scanner;

public class ControleSimplesDeSaques {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double limiteDiario = scanner.nextDouble();

      int counter = (int) limiteDiario;
      for (int i = 0; i < counter; i++) {
          double saque = scanner.nextDouble();
          if (saque <= 0) {
              System.out.println("Transacoes encerradas.");
              break;   
          } else if (saque > 0 && saque <= limiteDiario) {
              limiteDiario -= saque;
              System.out.println("Saque realizado. Limite restante: " + limiteDiario);
          } else {
              System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
              break;
          }
      }
      scanner.close();
  }
}