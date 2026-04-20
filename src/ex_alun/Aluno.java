package ex_alun;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;


    public Aluno(String nome, double nota1, double nota2){ //Construtor
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public double calcularMedia(){ // Não coloca parâmetro porque nota1 e 2 lá são atributos da classe
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public String getNome(){
        return nome;
    }
    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }


    public String situacao(){  // Não coloca parâmetro porque nota1 e 2 lá são atributos da classe
        double media = calcularMedia();
        if (media >=7){
            return "Aprovado";
        } else if (media >= 5){
            return "Exame";
        } else {
            return "Reprovado";
        }
    }
}
