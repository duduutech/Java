package ex_alun;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Eduardo", 3, 7.4);
        System.out.println("Nome " + a1.getNome());
        System.out.println("Nota1 " + a1.getNota1());
        System.out.println("Nota2 " + a1.getNota2());
        System.out.println("Situação: " + a1.situacao());
    }
}
