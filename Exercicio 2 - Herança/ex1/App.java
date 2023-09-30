
public class App {

    public static void main(String[] args) {
        Peixe peixin = new Peixe("Peixe Junin", 30.5, "Agua Doce");
        Cachorro cachorrin = new Cachorro("Cachorro Robson", 34.5, "Pitbull");

        // Aqui podem ser utilizados os métodos gets e setters para ver e alterar o
        // valor da classe Peixe e Cachorro.

        System.out.println("");
        System.out.println(peixin.toString());
        System.out.println("");
        System.out.println(cachorrin.toString());
    }
}
