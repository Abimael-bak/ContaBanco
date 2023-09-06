import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("escreva o numero da Agencia:");
       int numero = scanner.nextInt();

       System.out.println("escreva o nome da Agencia:");
       String agencia = scanner.next();

       System.out.println("Escreva o seu Nome :");
       String nomeCliente = scanner.next();

       System.out.println("Escreva seu Saldo :");
       double saldo = scanner.nextDouble();

       System.out.println("Ola," + nomeCliente + " Obrigado por Criar um Conta em nosso Banco, sua agencia é " + agencia + ",conta " + numero + "e seu saldo é " + saldo);

    }
      
}

       
