package ex_avancado;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private double horasTrabalhada;

    public Funcionario (String nome, double salarioBase, double horasTrabalhada){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhada = horasTrabalhada;
    }

    public double calcularSalario(){
        double valorHora = salarioBase / 160;

        if (horasTrabalhada > 160){
            double horasExtras = horasTrabalhada - 160;
            return salarioBase + (horasExtras * valorHora * 1.5);
        }else {
            return salarioBase;
        }

    }

    public String getNome(){
        return nome;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public double getHorasTrabalhada(){
        return horasTrabalhada;
    }



}
