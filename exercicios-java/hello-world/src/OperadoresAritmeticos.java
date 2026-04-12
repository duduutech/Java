public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = 15;

        int resultado = x + y;
        System.out.println(resultado);

        resultado = x - y;
        System.out.println(resultado);

        resultado = x * y;
        System.out.println(resultado);

        resultado = x / y;
        System.out.println(resultado);

        resultado = x % y;
        System.out.println(resultado);

        resultado = (x + y) - z  * x - (x / y);
        System.out.println(resultado);
    }
}
