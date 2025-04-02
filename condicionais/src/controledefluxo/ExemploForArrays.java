package controledefluxo;

public class ExemploForArrays {
	public static void main(String[] args) {
	
		String alunos [] = {"João", "Paulo", "Marcela", "Pedro", "Julia"};
		
		for (String aluno : alunos) {
			System.out.println("O nome do aluno é: " + aluno);
		}
		
		for (int x = 0; x < alunos.length; x++) {
			System.out.println("O aluno de número " + (x + 1) + " é: " + alunos [x]);
		}
}
}
