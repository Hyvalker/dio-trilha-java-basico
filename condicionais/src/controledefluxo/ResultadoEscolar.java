package controledefluxo;
import java.util.Scanner;

public class ResultadoEscolar {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Vamos verificar se você foi aprovado ou reprovado: ");
		
		System.out.println("Digite a sua nota: ");
			double nota = scanner.nextDouble();
			
		if (nota >= 7) {
			System.out.println("Parabéns! Você foi aprovado!");
		}
		else {
			System.out.println("Sinto muito, você foi reprovado e precisará refazer a disciplina.");
		}
		
}
}
