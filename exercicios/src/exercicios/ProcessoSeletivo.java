package exercicios;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
public static void main(String[] args) {
	
	
}
	static void selecaoCandidatos () {
		String [] candidatos =  {"FELIPE,","MARCIA","JULIA","CAIO","ANDRE","ANA","PAULO","MARCELA","SOPHIA","FABRICIO","MIRELA","ANTONIO","DANIELA"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou R$" + salarioPretendido);
			if (salarioBase >= salarioPretendido)
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1600, 2500);
	}
	
	static void analisarCandidato (double pretensaoSalario) {
	double salarioBase = 2000.00;
	if (salarioBase > pretensaoSalario) {
		System.out.println("Ligar para o candidato.");
	} else if (pretensaoSalario == salarioBase){
		System.out.println("Ligar para o candidato com contra proposta.");
	} else {
		System.out.println("Aguardando resultado dos demais candidatos");
	}
	
	}
	
}

