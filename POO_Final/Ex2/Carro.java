import java.util.Scanner;

public class Carro extends Veiculo {
    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quilometragem do carro:");
        km = scanner.nextDouble();
    }

    @Override
    public double getPreco() {
        if (km > 100000) {
            return preco * 0.92;
        }
        return preco;
    }

    public double getKm() {
        return km;
    }
}
