import java.util.Scanner;

import java.util.Scanner;

public class EntradaESaidas {
    public static void main(String[] args) {

        int idade = 0;

        Scanner sc = new Scanner (System.in); // (System.in) - entrada de dados
        System.out.print("Digite seu Nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

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


// Ler informações digitadas pelo usuário utiliza a Classe = Scanner;
// Scanner sc = new Scanner(System.in);
// Permite Leitura de um texto digitado pelo usuário;
// Classe Scanner está definida no pacote java.util;
//sc.nextLine - Colocar mais do que uma palavra digitada pelo usuário
//sc.next() - Colocar apenas uma palavra
//sc.nextInt, nextDouble ...
