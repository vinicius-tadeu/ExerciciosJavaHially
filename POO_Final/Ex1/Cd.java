

class Cd extends Midia {
    private int numMusicas;

    public Cd() {
    }

    public Cd(int codigo, double preco, String nome, int numMusicas) {
        super(codigo, preco, nome);
        this.numMusicas = numMusicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Músicas: " + numMusicas;
    }

    public void setMusica(int numMusicas) {
        this.numMusicas = numMusicas;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de músicas do CD:");
        numMusicas = scanner.nextInt();
    }
}
