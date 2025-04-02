package controledefluxo;
import java.util.Scanner;


public class ExemploWhile {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int numero;

	while (true) {  // Loop infinito, só para quando a condição dentro for atendida
	    System.out.print("Digite um número maior que 0: ");
	    numero = scanner.nextInt();
	    if (numero > 0) {
	    	break;  // Sai do loop se a condição for atendida
	}
	    System.out.println("Número inválido! Tente novamente.");
	}

	System.out.println("Você digitou: " + numero);
	scanner.close(); 
		
	}
}