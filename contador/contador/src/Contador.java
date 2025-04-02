import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int primeiroValor = scanner.nextInt();
        System.out.println("Digite o segundo valor");
        int segundoValor = scanner.nextInt();

        try {
            contar(primeiroValor, segundoValor);
        }
        catch (ParametrosInvalidosException e){
            System.out.println("Valor invalido: " +  e.getMessage());
        }
    }

    static void contar (int primeiroValor, int segundoValor) throws ParametrosInvalidosException {
        int contador = 1;
        if (primeiroValor > segundoValor) {
            throw new ParametrosInvalidosException("O primeiro valor deve ser menor que o segundo.");

        }

        for(int indice = primeiroValor; indice < segundoValor; indice++){
            System.out.println("Imprimindo o número " + contador);
            contador++;
        }
    }
}
