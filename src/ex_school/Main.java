package ex_school;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Historia", "Henrique");
        Aluno a1 = new Aluno("1203912", "Eduardo");
        Aluno a2 = new Aluno("12334", "Maria");
        Aluno a3 = new Aluno("231233", "Davi");

        Turma t1 = new Turma(p1, a1, a2, a3);
        t1.exibirTurma();
    }
}
