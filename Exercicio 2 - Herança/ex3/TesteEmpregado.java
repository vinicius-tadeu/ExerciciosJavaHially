package ex3;

public class TesteEmpregado {
    public static void main(String[] args) {
         // Criando um empregado
         Empregado empregado = new Empregado("Carlos", "Rua C", "555555555", 1, 3000.0, 10.0);

         // Testando os getters e setters
         System.out.println("Endereço do empregado: " + empregado.getEndereco());
         System.out.println("Código do setor do empregado: " + empregado.getCodigoSetor());
 
         // Testando o método calcularSalario()
         double salarioEmpregado = empregado.calcularSalario();
         System.out.println("Salário do empregado: " + salarioEmpregado);
    }
}
