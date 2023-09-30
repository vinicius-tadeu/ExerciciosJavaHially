

public class Animal {
    private String nome;
    private double peso;

    public String getNome(){
        return this.nome;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public String toString(){
        return "Nome:" + this.nome + "\n" + "Peso:" + this.peso;
    }

    Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

}