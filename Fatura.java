/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author vinicius.tadeu
 */
public class Fatura {
     
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;
    
    // Construtor
    
    public Fatura(String numero, String descricao, int quantidade, double precoPorItem){
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
        if (precoPorItem > 0) {
            this.precoPorItem = precoPorItem;
        } else {
            this.precoPorItem = 0.0;
        }
    }
    
    // Métodos Getter e Setter para numero
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    // Métodos Getter e Setter para descricao
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    // Métodos Getter e Setter para quantidade
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    // Métodos Getter e Setter para quantidade
    
    public double getPrecoPorItem() {
        return precoPorItem;
    }
    
    public void setPrecoPorItem(double precoPorItem) {
        if(precoPorItem > 0){
            this.precoPorItem = precoPorItem;
        } else{
            this.precoPorItem = 0.0;
        }
    }
    // Método para calcular o total da fatura
    public double getTotalFatura() {
        double total = quantidade * precoPorItem;
        if (total > 0) {
            return total;
        } else {
            return 0.0;
        }
    }
}


