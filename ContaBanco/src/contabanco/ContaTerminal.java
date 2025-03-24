package contabanco;
import java.util.Scanner;
public class ContaTerminal {
public static void main(String[] args) {
	//TODO: Conhecer e importar a classe Scanner
	
	//Exibir as mensagens para o usuário
	
	//Obter pela Scanner os valores digitados no terminal
	
	//Exibir a mensagem final
	
	Scanner scanner = new Scanner (System.in);
	System.out.println("Digite seu nome: ");
	String nome = scanner.nextLine();
	
	System.out.println("Digite o número da agência");
	String agencia = scanner.nextLine();
	
	System.out.println("Digite o número da conta: ");
	int numeroConta = scanner.nextInt();
	
	System.out.println("Digite o saldo da conta: ");
	double saldo = scanner.nextDouble();
	
	
	System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco; sua agência é " + agencia + ", o número da sua conta: " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque!");
}
}
