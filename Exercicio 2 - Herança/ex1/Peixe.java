

public class Peixe extends Animal{
    String tipoHabitat;

    Peixe(String nome, double peso, String tipoHabitat){
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String toString(){
        return super.toString() + "\n"+"Habitat:" + this.tipoHabitat;
    }
}
