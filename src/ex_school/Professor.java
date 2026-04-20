package ex_school;

public class Professor {
    private String nome;
    private String disciplina;

    public Professor(String disciplina, String nome) {
        this.disciplina = disciplina;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }
}
