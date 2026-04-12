public class IncrementoDecremento {
    public static void main(String[] args) {

        int x = 10;

        x++; // soma 1 - Incremento
        System.out.println("O valor de X: " + x);

        x--; // Valor volta a ser 10 - Decremento;
        System.out.println("O valor de X: " + x);

        int y = 15, z = 10, a = 5; //Podem ser criadas na mesma linha;

        z = y++;
        System.out.println("z = " + z);
        System.out.println("y = " + y);

    }
}
