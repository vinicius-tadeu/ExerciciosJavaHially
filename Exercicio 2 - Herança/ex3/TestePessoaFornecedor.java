package ex3;

public class TestePessoaFornecedor {
    public static void main(String[] args) {

        // Testando Construtores de Pessoa e Fornecedor

        Pessoa pessoa = new Pessoa("Jose", "Rua A", "12312312312");

        Fornecedor fornecedor = new Fornecedor("Maria", "Rua B", "112312312312", 5000, 2000);


        // Testando os getters e setters
        System.out.println("Nome da pessoa: " + pessoa.getNome());
        System.out.println("Endereço do fornecedor: " + fornecedor.getEndereco());

        // Testando o método obterSaldo()
        double saldoFornecedor = fornecedor.obterSaldo();
        System.out.println("Saldo do fornecedor: " + saldoFornecedor);

    }

}
