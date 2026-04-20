
public class Pessoa { //Classe Pessoa

    private String nomeCompleto;

    public Pessoa(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public void exibirInformacoes(){
        System.out.println("Nome completo: " + nomeCompleto.toUpperCase()); //Letra maiuscula;
        System.out.println("Caracteres: " + nomeCompleto.length()); //Caracteres;
        String[] partes = nomeCompleto.split(" "); // Separação
        System.out.println("Nome Separado: " + partes[0]);
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Eduardo Lima de Souza");
        p.exibirInformacoes();

    }
}