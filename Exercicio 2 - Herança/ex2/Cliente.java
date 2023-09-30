package ex2;

public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascimento;

    Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascimento) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    public double getValorDivida(){
        return this.valorDivida;
    }

    public int getAnoNascimento(){
        return this.anoNascimento;
    }

    public String toString() {
        return "Nome:" + getNome() + "\nIdade:" + getIdade() + "\nSexo:" + getSexo() + "\nValor da divida:"
                + valorDivida + "\nAno Nascimento:" + anoNascimento;
    }
}
