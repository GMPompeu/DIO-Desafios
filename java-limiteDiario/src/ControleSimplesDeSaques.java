import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        double valorSaque = scanner.nextDouble();

        for(int cont =1 ; valorSaque != 0; cont ++){
            if(valorSaque <= limiteDiario){
              limiteDiario -= valorSaque;
              System.out.println("Saque realizado. Limite restante: " + limiteDiario);
              System.out.println("Transacoes encerradas.");
            }else{
              System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
              break;
            }
            valorSaque = scanner.nextDouble();
        }
        scanner.close();
    }
}