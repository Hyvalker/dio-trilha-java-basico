public class Vendedor extends Funcionario {
    private static int totalSold = 0;
    private int individualSales = 0;

    public Vendedor(String name, String email, String password) {
        super(name, false, email, password);
    }
    public void makeSales(){
        totalSold++;
        individualSales++;
        System.out.println("Venda realizada com sucesso!");
    }
    public static int getTotalSold() {
        return totalSold;
    }
    public int getIndividualSales() {
        return individualSales;
    }

}
