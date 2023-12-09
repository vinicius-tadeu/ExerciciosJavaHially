import java.util.Scanner;

class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {
        
    }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + ", Preço: " + preco + ", Nome: " + nome;
    }

    public void printDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println(getDetalhes());
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código da mídia:");
        codigo = scanner.nextInt();
        System.out.println("Digite o preço da mídia:");
        preco = scanner.nextDouble();
        System.out.println("Digite o nome da mídia:");
        nome = scanner.next();
    }
}

