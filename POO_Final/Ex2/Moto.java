import java.util.Scanner;

public class Moto extends Veiculo {
    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano da moto:");
        ano = scanner.nextInt();
    }

    @Override
    public double getPreco() {
        if (ano >= 2008) {
            return preco * 1.10;
        }
        return preco;
    }

    public int getAno() {
        return ano;
    }
}
