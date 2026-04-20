package ex_school;

public class Aluno {
    private String nome;
    private String matricula;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
