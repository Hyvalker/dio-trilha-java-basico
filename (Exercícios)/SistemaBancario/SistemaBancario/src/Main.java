import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Abrindo a conta
        System.out.println("Digite o valor para abertura da conta: ");
        double depositoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(depositoInicial);

        var option = -1;
        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se está utilizando o cheque especial");
            System.out.println("7 - Mostrar resumo da conta");
            System.out.println("8 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositarDinheiro(valorDeposito);
                    break;

                case 4:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorSacar = scanner.nextDouble();
                    conta.sacarDinheiro(valorSacar);
                    break;
                case 5:
                    System.out.println("Digite o valor que deseja pagar: ");
                    double valorPagar = scanner.nextDouble();
                    conta.pagarBoleto(valorPagar);
                    break;
                case 6:
                    conta.checarUsoChequeEspecial();
                    break;
                case 7:
                    conta.mostrarResumo();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamente.");
            }
        }while (true);
    }


}