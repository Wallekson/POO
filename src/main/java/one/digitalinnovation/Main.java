package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro(); // nesse primeiro exemplo usamos o construtor vazio

        carro1.setCor("Branco"); // adicionamos os atributos
        carro1.setModelo("Mazda Rx8");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo()); // mostramos os atributos
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Cinza", "Bmw X6", 66); // no segundo usamos o construtor
                                                                                   // de sobrecarga
        System.out.println("\nModelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade do Tanque: " + carro2.getCapacidadeTanque());
        System.out.println("Valor Total : " + carro2.totalValorTanque(6.46));



    }
}
