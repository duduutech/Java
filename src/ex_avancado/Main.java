package ex_avancado;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Jéssica", 1500, 200);
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salario Base: " + f1.getSalarioBase());
        System.out.println("Horas Trabalhada: " + f1.getHorasTrabalhada());
        System.out.println("Calculo Salário: " + f1.calcularSalario());
    }
}
