import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Item no carrinho
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    //Adiciona itens ao carrinho
    public void adicionarItem(String itemName, double price, int itemQuantity) {
        itemList.add(new Item(itemName, price, itemQuantity));
    }
    //Remove do carrinho todos os itens com mesmo nome
    public void removerItem(String itemName) {
        itemList.removeIf(i -> i.getItemName().equals(itemName));
    }
    //Calcula o valor total do carrinho
    public double calcularValorTotal() {
        double valorTotal = 0.0;

        for (Item i: itemList){
            valorTotal += i.getItemPrice() * i.getItemQuantity();
        }
        return valorTotal;
    }
    //Exibe os itens do carrinho
    public void exibirItensNoCarrinho() {
        System.out.println(itemList);
    }

    //Testando os métodos
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Coca-Cola 3 Litros", 11.99, 3);
        carrinho.adicionarItem("Açucar 1 kg", 4.99, 4);
        carrinho.adicionarItem("Sabonete", 2.20, 9);

        carrinho.exibirItensNoCarrinho();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Sabonete");

        carrinho.exibirItensNoCarrinho();
    }


}
