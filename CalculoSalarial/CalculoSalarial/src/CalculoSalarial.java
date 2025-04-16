import java.util.Scanner;
public class CalculoSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float imposto = 0.0F;
        System.out.print("Digite o valor do seu salário bruto: ");
        float salario = scanner.nextFloat();
        System.out.println("Digite o valor de benefícios recebidos além do salário: ");
        float beneficios = scanner.nextFloat();

        float salarioLiquido = salario - calcularImposto(salario) + beneficios;
        System.out.printf("Seu salário líquido é de R$" + salarioLiquido);
    }
    static float calcularImposto(float salario) {
        float aliquota;
        if(salario >= 0 && salario <= 1100.0) {
            aliquota = 0.05F;
        }else if(salario > 1100.0 && salario <= 2500.0){
            aliquota = 0.1F;
        }else {
            aliquota = 0.15F;
        } return salario * aliquota;

    }

}
