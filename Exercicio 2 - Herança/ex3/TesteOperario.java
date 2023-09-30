package ex3;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("João", "Rua E", "777777777", 3, 2000.0, 5.0, 15000.0, 2.0);

        // Testando os getters e setters
        System.out.println("Telefone do operário: " + operario.getTelefone());
        System.out.println("Comissão do operário: " + operario.getComissao());

        // Testando o método calcularSalario()
        double salarioOperario = operario.calcularSalario();
        System.out.println("Salário do operário: " + salarioOperario);
    }
}
