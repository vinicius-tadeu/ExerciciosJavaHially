

class Dvd extends Midia {
    private int numFaixas;

    public Dvd() {
    }

    public Dvd(int codigo, double preco, String nome, int numFaixas) {
        super(codigo, preco, nome);
        this.numFaixas = numFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Faixas: " + numFaixas;
    }

    public void setFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de faixas do DVD:");
        numFaixas = scanner.nextInt();
    }
}
