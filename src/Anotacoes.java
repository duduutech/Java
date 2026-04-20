public class Anotacoes {

    /*
    public class Pessoa {

    Define a classe - é a "planta" do objeto. Tudo que define um Pessoa fica dentro das chaves;

     */

//==================================================================================================================================

    /*
        private String nomeCompleto;
        É o atributo - uma variável que pertence à classe. Fica fora dos métodos porque precisa existir enquanto o objeto existir.

        private → só a própria classe pode acessar
        String → o tipo do dado
        nomeCompleto → o nome da variável
     */

//=====================================================================================================================================

    /*
        public void exibirInformacoes() {
        É um método — uma ação que o objeto pode executar.

            public → qualquer classe pode chamar esse método
            void → não retorna nenhum valor
            exibirInformacoes() → nome do método
     */



//======================================================================================================================================
    //Atributos são variaveis que pertence a uma classe;

    /*      public class Pessoa {
                private String nomeCompleto; // ← isso é um atributo
                private int idade;           // ← isso também
                private String cpf;          // ← e esse
            }

     */

//======================================================================================================================================

    /*
         Construtor é um método especial que é chamado automaticamente quando você cria um objeto com new.
                public class Pessoa {
                private String nomeCompleto;

                // construtor
                public Pessoa(String nomeCompleto) {
              //    ↑             ↑
              //  nome da       parâmetro que
              //  classe        você passa no new

                    this.nomeCompleto = nomeCompleto;
              //    ↑                    ↑
              //  atributo            parâmetro
              //  da classe           recebido
                }
            }

              Tem o mesmo nome da classe → Pessoa
              Não tem tipo de retorno → nem void
              Não usa return
     */



//======================================================================================================================================

    //Variavel x Atributo
    //Variável fica dentro de um método
    //Atributo fica fora dos métodos, dentro da classe

    /*

                public class Pessoa {
                private String nomeCompleto; // atributo — pertence ao objeto, existe enquanto o objeto existir

                public void exibirInformacoes() {
                    String texto = "olá"; // variável local — existe só dentro desse método
                }
            }
     */

//======================================================================================================================================

    /*
          Pessoa p = new Pessoa("Eduardo Lima de Souza");
            Essa linha tem três partes:
                javaPessoa p = new Pessoa("Eduardo Lima de Souza");
                //  1    2       3              4
            1 — Pessoa p → declara uma variável do tipo Pessoa. É como dizer "vou guardar uma pessoa aqui".
            2 — = → atribui o objeto à variável.
            3 — new → cria o objeto na memória.
            4 — Pessoa("Eduardo Lima de Souza") → chama o construtor passando o nome. O construtor guarda esse valor no atributo nomeCompleto.

          p.exibirInformacoes();
            Essa linha chama o método exibirInformacoes() no objeto p.
                javap.exibirInformacoes();
                // ↑        ↑
                // objeto   método que você quer executar
            O . significa "entra nesse objeto e executa esse método". Igual ao que você fez antes com p.getFornecedor().getNome().


     */

//======================================================================================================================================


    /*
                O between é um método estático da classe Duration. Em inglês, a palavra between significa "entre".
                // O que você escreveu:
            Duration d = Duration.between(inicio, fim);
     */

}
