package ex3;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    // Construtor
    Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    // Getters e Setters específicos de Fornecedor
     public double getValorCredito() {
        return valorCredito;
    }
    public double getValorDivida() {
        return valorDivida;
    }
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
     // Método para obter o saldo
     public double obterSaldo() {
        return valorCredito - valorDivida;
    }
}
