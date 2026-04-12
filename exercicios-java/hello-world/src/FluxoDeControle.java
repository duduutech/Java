public class FluxoDeControle {
    public static void main(String[] args) {

        int idade = 100;

        if (idade >= 18 && idade < 70) {
            System.out.println("Maior Idade");
        } else if (idade >= 70){
            System.out.println("Terceira Idade");
            if (idade == 100){
                System.out.println("Centenária");
            }
        } else {
            System.out.println("Menor Idade");
        }


    }
}
// Condição usa-se IF and ELSE