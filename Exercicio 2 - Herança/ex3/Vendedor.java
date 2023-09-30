package ex3;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    // Construtor
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    // Getters e Setters específicos de Vendedor
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Sobrescrevendo o método calcularSalario
    @Override
    public double calcularSalario() {
        double salarioEmpregado = super.calcularSalario();
        double salarioVendedor = salarioEmpregado + (valorVendas * (comissao / 100));
        return salarioVendedor;
    }
}
