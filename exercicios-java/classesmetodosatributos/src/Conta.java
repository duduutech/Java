public class Conta {

    int numero;
    double saldo;

    Cliente cliente = new Cliente();

    //Metodo;
    public double recuperarSaldo(){
            return saldo;
    }

    public void depositar(double valor){
            saldo += valor;
    }

    public void retirar(double valor){
        saldo -= valor;
    }

    public void retirar(double valor, double taxa){
        saldo -= valor - taxa;
    }


    int agencia;

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
}

//Atributos
//Uma classe pode conter nenhum ou vários atributos
//Os atributos serão utilizados para armazenar informações do objeto. Essas informações diferenciam um objeto do outro;
//Atributos são variáveis que armazenam informações do objeto, exemplo acima;
//lowerCamelCase - Primeira letra é minúscula e as demais palavras maiúscula;


//Metodo
//Definem os comportamentos que o objeto possui. Pode ser entendido como uma ação ou serviço;
// Definido como comportamento específico, residente no objeto, que define como ele deve agir;
//lowerCamelCase - Primeira letra é minúscula e as demais palavras maiúscula;

// [Quem vê] [O que devolve] [Nome da Ação] ([O que entra])
//  public      void           setForca     (int forca)
// = serva para atribuir um novo valor ao atributo;


/**
 * O atributo <b>this.energia</b> representa o estado atual do objeto.
 * <p>
 * Ao usar o método, o parâmetro (novo valor) sobrescreve o valor antigo
 * através do operador de atribuição (=).
 */