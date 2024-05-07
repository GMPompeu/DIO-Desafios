import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }finally{
            scanner.close();
        }
    }
    public static void verificarNumeroConta(String numeroConta){
        if (numeroConta.length() == 8) {
            return;
        }else{
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos");
        }
    }
}
