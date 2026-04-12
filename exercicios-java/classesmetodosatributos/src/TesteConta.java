
public class TesteConta {
    public static void main(String[] args) {

        Conta  contaCorrente = new Conta();
        Conta contapoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.50;
        contaCorrente.cliente.nome = "Eduardo";
        contaCorrente.cliente.idade = 18;

        contapoupanca.numero = 22;
        contapoupanca.saldo = 30;
        contapoupanca.cliente.nome = "Maria";
        contapoupanca.cliente.idade = 30;

        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 40;
        contaInvestimento.cliente.nome = "Marta";
        contaInvestimento.cliente.idade = 28;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);
    }
}


//Classe
//Classe possui o modelo ou estrutura a partir do qual os objetos serão criados.
//Um objeto é uma instância de uma classe. Para instanciar uma classe utilizamos o operador new.
// new - comando para reservar um espaço na memória e criar um objeto real baseado no molde CONTA.
//Variável é um espaço na memória do computador que reservamos. (Conta)



