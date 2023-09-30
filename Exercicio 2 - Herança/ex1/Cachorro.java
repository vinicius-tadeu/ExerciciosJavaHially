
public class Cachorro extends Animal{
    String raca;

    Cachorro(String nome, double peso, String raca){
        super(nome, peso);
        this.raca = raca;
    }

    public String toString(){
        return super.toString() + "\n"+"Raca:" + this.raca;
    }
}
