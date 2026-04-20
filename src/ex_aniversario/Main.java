package ex_aniversario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Aniversario n1 = new Aniversario(LocalDate.of(1965, 12, 20));
        System.out.println("Idade: " + n1.calcularIdade());
        System.out.println("Dias vividos: " + n1.diasVividos());
    }
}
