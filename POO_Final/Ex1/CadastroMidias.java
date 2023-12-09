public class CadastroMidias {
    public static void main(String[] args) {
        DVD dvd = new DVD();
        dvd.inserirDados();
        dvd.printDados();

        System.out.println();

        CD cd = new CD();
        cd.inserirDados();
        cd.printDados();
    }
}