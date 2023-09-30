package ex3;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Maria", "Rua F", "888888888", 4, 2500.0, 5.0, 30000.0, 2.5);

        // Testando os getters e setters
        System.out.println("Endereço do vendedor: " + vendedor.getEndereco());
        System.out.println("Valor de vendas do vendedor: " + vendedor.getValorVendas());

        // Testando o método calcularSalario()
        double salarioVendedor = vendedor.calcularSalario();
        System.out.println("Salário do vendedor: " + salarioVendedor);
    }
}
