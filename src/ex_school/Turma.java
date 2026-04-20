package ex_school;

public class Turma {
    private Professor professor;
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;


    public Turma(Professor professor, Aluno aluno1, Aluno aluno2, Aluno aluno3){
        this.professor = professor;
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
        this.aluno3 = aluno3;
    }

    public void exibirTurma(){ //void - vazio. Apenas executa instruções, mas não devolve nenhum dado
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("==========================================================");
        System.out.println("Alunos");
        System.out.println("- " + aluno1.getNome());
        System.out.println("- " + aluno2.getNome());
        System.out.println("- " + aluno3.getNome());
    }

}
