package ex3;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Ana", "Rua D", "444444444", 2, 4000.0, 15.0, 1000.0);

        // Testando os getters e setters
        System.out.println("Endereço do administrador: " + administrador.getEndereco());
        System.out.println("Ajuda de custo do administrador: " + administrador.getAjudaDeCusto());

        // Testando o método calcularSalario()
        double salarioAdministrador = administrador.calcularSalario();
        System.out.println("Salário do administrador: " + salarioAdministrador);
    }
}
