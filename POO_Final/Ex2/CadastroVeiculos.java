import java.util.ArrayList;
import java.util.Scanner;

public class CadastroVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        while (true) {
            System.out.println("Escolha o tipo de veículo (1 para Moto, 2 para Carro, 0 para sair):");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            }

            System.out.println("Digite o modelo do veículo:");
            String modelo = scanner.next();
            System.out.println("Digite o preço do veículo:");
            double preco = scanner.nextDouble();

            if (escolha == 1) {
                Moto moto = new Moto(modelo, preco, 0);
                moto.insertData();
                veiculos.add(moto);
            } else if (escolha == 2) {
                Carro carro = new Carro(modelo, preco, 0);
                carro.insertData();
                veiculos.add(carro);
            }
        }

        // Imprime relatório
        System.out.println("\nRelatório de Veículos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
            System.out.println("Novo Preço: R$" + veiculo.getPreco() + "\n");
        }

        // Levantamento acerca das motos e carros
        double totalAntesReajuste = veiculos.stream().mapToDouble(Veiculo::getPreco).sum();

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                if (((Moto) veiculo).getAno() >= 2008) {
                    veiculo.preco *= 1.10;
                }
            } else if (veiculo instanceof Carro) {
                if (((Carro) veiculo).getKm() > 100000) {
                    veiculo.preco *= 0.92;
                }
            }
        }

        double totalAposReajuste = veiculos.stream().mapToDouble(Veiculo::getPreco).sum();

        // Imprime novo relatório
        System.out.println("\nRelatório de Veículos Após Reajustes:");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
            System.out.println("Novo Preço: R$" + veiculo.getPreco() + "\n");
        }

        System.out.println("Total de preços antes dos reajustes: R$" + totalAntesReajuste);
        System.out.println("Total de preços após os reajustes: R$" + totalAposReajuste);
    }
}
