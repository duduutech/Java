package ex_bancaria_conta;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    public ContaBancaria(String titular, double saldo, int numeroConta){  //O que está dentro do parêntese é o parâmetro (Construtor Parametros)
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo){ //Metodo - ação
        if (saldo < 0 ){
            System.out.println("Erro!Saldi não pode ser negativo");
            return; // interrompe
        }
        this.saldo = saldo;
    }


    //Encapsulamento com get set - get função que busca algo / set apenas executa ação
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){ //Sett sempre recebe um parâmetro porque ele recebe um valor novo e atribui ao atributo
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) { //Sett sempre recebe um parâmetro porque ele recebe um valor novo e atribui ao atributo
        this.numeroConta = numeroConta;
    }
}
