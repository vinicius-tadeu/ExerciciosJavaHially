package ex2;

public class Vendedor extends Empregado{
    private double valorVendas;
    private int qntVendas;

    Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int qntVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }

    public double getValorVendas(){
        return this.valorVendas;
    }

    public int getQntVendas(){
        return this.qntVendas;
    }

    public void setValorVendas(double valorVendas){
        this.valorVendas = valorVendas;
    }

    public void setQntVendas(int qntVendas){
        this.qntVendas = qntVendas;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nSalario: " + getSalario()+"\nValor das Vendas: " + valorVendas + "\nQuantidade de vendas: " + qntVendas;
    }

}
