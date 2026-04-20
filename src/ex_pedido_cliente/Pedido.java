package ex_pedido_cliente;

public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;


    public Pedido (Cliente cliente, Produto produto, int quantidade){ //Construtor com parâmetro
        this.cliente= cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public double calcularTotal(){ //metodo
        return produto.getPreco() * quantidade;
    }


    public void exibirResumo(){
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Total: " + calcularTotal());
    }
}
