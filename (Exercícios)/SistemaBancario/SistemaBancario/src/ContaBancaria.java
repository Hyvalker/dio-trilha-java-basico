public class ContaBancaria {

    private double saldo;
    private double chequeEspecialInicial;
    private double chequeEspecial;

    public ContaBancaria(double depositoInicial) {
    this.saldo = depositoInicial;

    if(depositoInicial <= 500) {
        this.chequeEspecialInicial = 50;
    }else {
        this.chequeEspecialInicial = depositoInicial/2;
    }
    this.chequeEspecial = this.chequeEspecialInicial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecialInicial() {
        return chequeEspecialInicial;
    }

    public void consultarSaldo(){
        System.out.println("O saldo da sua conta é de: R$" + this.getSaldo());
    }
    public void consultarChequeEspecial(){
        System.out.println("Você possui R$" + this.getChequeEspecial() + " de limite de cheque especial.");
    }
    public void depositarDinheiro(double valor){
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        System.out.println("Saldo atual: " + this.getSaldo());

        aplicarTaxaChequeEspecial();
    }
    public boolean sacarDinheiro(double valor){
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return false;
        }
        double totalDisponivel = this.saldo + chequeEspecial;

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        }else if (valor <= totalDisponivel) {
            double valorUsadoCheque = valor - this.saldo;
            this.saldo = 0;
            this.chequeEspecial -= valorUsadoCheque;
            System.out.println("Saque realizado com sucesso usando o cheque especial. Valor usado: R$" + valorUsadoCheque);
            return true;
        }else {
            System.out.println("Saldo e limite insuficientes para saque");
        }
        System.out.println("Saldo atual: " + this.saldo);
        return false;
    }
    public void pagarBoleto(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para realizar pagamentos.");
        }
        double totalDisponivel = this.saldo + chequeEspecial;

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso.");
        }else if(valor <= totalDisponivel) {
            double valorUsadoCheque = valor - this.saldo;
            this.saldo = 0;
            this.chequeEspecial -= valorUsadoCheque;
            System.out.println("Pagamento realizado com sucesso usando o cheque especial. Valor usado: R$" + valorUsadoCheque);
        }else {
            System.out.println("Saldo e limite insuficientes para pagamento.");
        }
        System.out.println("Saldo atual: " + this.saldo);
    }
    public void checarUsoChequeEspecial(){
        if (this.saldo < 0) {
        System.out.println("Você está usando o cheque especial. Seu limite atual é de R$" + this.chequeEspecialInicial);
        }else {
            System.out.println("Você ainda não utilizou o seu cheque especial");
        }
    }
    public void aplicarTaxaChequeEspecial(){
        double limiteTotal = (this.saldo + chequeEspecial);
        double limiteUsado = (getChequeEspecialInicial()) - chequeEspecial;
        if (limiteUsado > 0) {
            double taxa = limiteUsado * 0.2;
            if (this.saldo >= taxa){
                this.saldo -= taxa;
                System.out.println("Foi cobrada uma taxa de R$" + taxa + " pelo uso do cheque especial.");
            }else {
                System.out.println("Saldo insuficiente para a cobrança de taxa de cheque especial. Será cobrado assim que houver saldo disponível.");
            }
        }
    }
    public void mostrarResumo() {
        System.out.println("=== Resumo da Conta ===");
        consultarSaldo();
        consultarChequeEspecial();
        checarUsoChequeEspecial();
        System.out.println("=======================");
    }
}
