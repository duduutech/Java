package ex_EndClient;

public class Main {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Av. Paulista", "São Paulo", "092012-12");
        Cliente c1 = new Cliente("Eduardo", "123123441321-09", e1);

        System.out.println("Cidade do Cliente: " + c1.getEndereco().getCidade());
        System.out.println("Rua do Cliente: " + c1.getEndereco().getRua());
        System.out.println("CEP do Cliente: " + c1.getEndereco().getCep());

    }
}
