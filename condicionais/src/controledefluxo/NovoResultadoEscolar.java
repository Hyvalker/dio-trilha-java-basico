package controledefluxo;

import java.util.Scanner;

public class NovoResultadoEscolar {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Vamos verificar se você foi aprovado ou reprovado:");
		
		System.out.println("Digite a sua nota: ");
			double nota = scanner.nextDouble();
			
		/*  String resultado = nota >= 7 ? "Aprovado": nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
				System.out.println(resultado); */
		if (nota >= 7) {
			System.out.println("Parabéns! Você foi aprovado!");
		}
		else if ( nota < 7 && nota >= 5) {
			System.out.println("Você precisará realizar a prova de recuperação");
		}
		else {
			System.out.println("Sinto muito, você foi reprovado e precisará refazer a disciplina."); 
		}
	}
}
