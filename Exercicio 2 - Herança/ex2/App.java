package ex2;

public class App {
    public static void main(String[] args) {
        Gerente g = new Gerente("Emerson", 53, "Masculino", 50000, "1", "Comercial");

        Vendedor v = new Vendedor("Vendedor 1", 0, "Feminino", 3000.32, "1231123123", 2000,5);

        Cliente c = new Cliente("Cliente Junin", 20, "Masculino", 20000, 1987);

        System.out.println("");
        System.out.println(g.toString());
        System.out.println("");
        System.out.println(v.toString());
        System.out.println("");
        System.out.println(c.toString());
        System.out.println("");
    }
}
