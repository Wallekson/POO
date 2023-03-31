package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); // Criamos e o Objeto e instanciamos

        Funcionario gerente = new Gerente();  // Upcast
        Funcionario vendedor = new Vendedor(); // Upcast é implicito
        Funcionario faxineiro = new Faxineiro(); //

        // Gerente gerente = new Funcionario(); // nesse caso o DownCast não esta de forma explicita e por isso temos um erro
        Vendedor vendedor_ = (Vendedor) new Funcionario(); // DownCast explicito
    }
}
