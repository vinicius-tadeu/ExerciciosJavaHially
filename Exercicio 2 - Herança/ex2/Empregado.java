package ex2;

public class Empregado extends Pessoa{
    private double salario;
    private String matricula;

    // Construtor da classe
    Empregado(String nome, int idade, String sexo, double salario, String matricula){
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario(){
        return this.salario;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public double valorInss(){
        return this.salario * 0.11;
    }

}
