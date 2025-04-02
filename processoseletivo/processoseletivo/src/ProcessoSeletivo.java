import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "PEDRO", "CARLOS", "ANA", "SOPHIA", "JOÃO", "EDUARDA", "LUANNA", "FABRÍCIO", "MIRELA", "ANTÔNIO", "JULIA"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }
    //case 4
    static void entrandoEmContato (String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
        } while(continuarTentando && tentativasRealizadas < 3);
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "° TENTATIVA.");
         else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS (" + tentativasRealizadas + ") ATINGIDO.");

    }

    //método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }


    static void imprimirSelecionados () {
        String[] candidatos = {"FELIPE", "PEDRO", "CARLOS", "ANA", "SOPHIA", "JOÃO", "EDUARDA", "LUANNA", "FABRÍCIO", "MIRELA", "ANTÔNIO", "JULIA"};
        System.out.println("Imprimindo lista de candidatos informando o índice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1)+ " é o(a)" + candidatos[indice]);
        }
    }
    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "PEDRO", "CARLOS", "ANA", "SOPHIA", "JOÃO", "EDUARDA", "LUANNA", "FABRÍCIO", "MIRELA", "ANTÔNIO", "JULIA"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O Candidato " + candidato + " solicitou R$" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O(a) cadidato(a) " + candidato + " foi selecionado(a) para a vaga.");
                candidatosSelecionados ++;
            }
            candidatosAtual ++;
        }

    }
        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1600, 2500);
        }
        static void analisarCandidato(double salarioPretendido) {
            double salarioBase = 2000.0;
            if (salarioBase > salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO OFERTANDO A VAGA");
            } else if (salarioBase == salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
            } else {
                System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
            }
            }



}
