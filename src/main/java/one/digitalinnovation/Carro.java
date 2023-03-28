package one.digitalinnovation;

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    // por padrão de boas práticas o ideal é colocar construtores, depois Get e Set, depois execução

    Carro(){ // Construtor Vazio

    }

    Carro(String cor, String modelo, int capacidadeTanque){ // Construtor sobrecarga
        this.cor = cor; // this é uma forma de diferenciar o que pertence ao objeto e o que não pertence
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() { // metodo get pede um retorno do, o tipo de dado deve ser compativel
        return cor; // tanto o método, quanto o retorno
    }

    public void setCor(String cor) { // o set é usado para colocar um valor em um atributo
        this.cor = cor; // colocamos o parametro String cor, do metodo set no atributo cor
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo; // this. modelo é o atributo do objeto, String modelo é o parâmetro
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
