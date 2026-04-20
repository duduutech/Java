package ex_pedido_cliente;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Eduardo", "0884198232-12");
        Produto p1 = new Produto("Notebook", 1500);
        Pedido pedido1 = new Pedido(c1, p1, 4);
        pedido1.exibirResumo();
    }
}
