package ex2;

public class Gerente extends Empregado {

    private String nomeGerencia;

    Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia(){
        return this.nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia){
        this.nomeGerencia = nomeGerencia; 
    }

    public String toString() {
        return "Nome:" + getNome() + "\nIdade:" + getIdade() + "\nMatricula:" + getMatricula() + "\nNome da Gerencia:"
                + this.nomeGerencia + "\nValor do INSS:" + valorInss();
    }
}
