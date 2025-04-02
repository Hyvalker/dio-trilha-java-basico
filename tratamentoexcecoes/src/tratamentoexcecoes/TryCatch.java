package tratamentoexcecoes;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TryCatch {
public static void main(String[] args) {
	try {
	Scanner scanner = new Scanner(System.in);
	scanner.useLocale(Locale.US);
	
	System.out.println("Digite seu nome: ");
	String nome = scanner.nextLine();
	
	System.out.println("Digite seu sobrenome: ");
	String sobrenome = scanner.nextLine();
	
	System.out.println("Digite sua idade ");
	int idade = scanner.nextInt();
	
	System.out.println("Digite sua altura: ");
	double altura = scanner.nextDouble();
	scanner.close();
	} 
	//catch ()
	catch (InputMismatchException e) {
		System.err.println("Os campos Idade e Altura precisam ser numéricos");
	}
	
	}
}
