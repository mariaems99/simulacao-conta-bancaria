//To do: Conhecer e importar a classe Scanner

import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        //Exibir as mensagens para o nosso usuário

        //Obter pela classe Scanner os valores digitados no terminal

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o  número da sua conta ");
        int numero = scanner.nextInt(); 

        System.out.println("Por favor, digite o número da Agência !");
        int agencia = scanner.nextInt();

        System.out.println("Digite o valor que você deseja adicionar: ");
        double saldo = scanner.nextDouble();
 
     //Exibir a mensagem conta criada   
     System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
            + agencia + ", conta número " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

     scanner.close();       
    }

      


}
