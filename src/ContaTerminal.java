import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{

    int numero = 1021;
    String agencia = "067-8";
    String nomeCliente = "Mario Andrade";
    double saldo = 237.48;
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Por favor, digite o número da agência");
        int numero = scanner.nextInt();
         

        System.out.println("Digite sua o número da sua agência");
        String agencia = scanner.next();

        System.out.println("Digite sua o seu nome");
        String nomeCliente  = scanner.next();

        
        System.out.println("Digite o valor do seu saldo");
        double saldo = scanner.nextDouble();
        

        System.out.println("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo: " + saldo + " já está disponivel para saque");


     
    }
}
