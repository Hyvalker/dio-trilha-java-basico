import java.util.concurrent.ThreadLocalRandom;

public class Atendente extends Funcionario {

    private double totalCash;

    public Atendente(String name, String email, String password) {
        super(name, false, email, password);
    }

    public double getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }

    public void receivePayment() {
        double randomPrice = ThreadLocalRandom.current().nextDouble(1, 3000);
        totalCash += randomPrice;
        System.out.println("Venda de " + randomPrice + " realizada com sucesso.");
    }
    public void closeCashier(){
        System.out.println("Fechando o caixa.");
    }

}
