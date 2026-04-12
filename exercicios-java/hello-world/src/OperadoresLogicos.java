public class OperadoresLogicos {
    public static void main(String[] args) {

        int idade = 20;

        boolean votar = idade >= 18 && idade <= 70;
        System.out.println(votar);
    }
}
// Operadores and, or, XOR, not;
// && - AND - true e false = false;
// || - OR - True ou false = true;
// ^ - XOR - (ou "OU exclusivo") é representado por ^;
// ! - NOT - Negativa, ou seja, Reverte o valor da expressão booleana.