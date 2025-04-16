public class Gerente extends Funcionario {


    public Gerente(String name, String email, String password) {
        super(name, true, email, password);
    }

    public void financialReport(){
        System.out.println("Gerando relatório financeiro...");
        System.out.println("=== Relatório financeiro gerado com sucesso! ===");
    }

    public void consultSales(Vendedor vendedor){
        System.out.println("Vendas do vendedor: " + vendedor.getName() +": " + vendedor.getIndividualSales());
        System.out.println("Total de vendas do dia: " + Vendedor.getTotalSold());
    }

}
