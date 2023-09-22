/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author vinicius.tadeu
 */
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe Fatura
        Fatura minhaFatura = new Fatura("001", "Teclado", 2, 50.0);

        // Imprimindo informações da fatura
        System.out.println("Número: " + minhaFatura.getNumero());
        System.out.println("Descrição: " + minhaFatura.getDescricao());
        System.out.println("Quantidade: " + minhaFatura.getQuantidade());
        System.out.println("Preço por Item: " + minhaFatura.getPrecoPorItem());
        System.out.println("Total da Fatura: " + minhaFatura.getTotalFatura());

        // Atualizando o preço por item (com valor negativo para testar o tratamento)
        minhaFatura.setPrecoPorItem(-30.0);

        // Atualizando a quantidade e número
        minhaFatura.setQuantidade(3);
        minhaFatura.setNumero("002");

        // Imprimindo informações atualizadas
        System.out.println("\nApós Atualizações:");
        System.out.println("Número: " + minhaFatura.getNumero());
        System.out.println("Quantidade: " + minhaFatura.getQuantidade());
        System.out.println("Preço por Item: " + minhaFatura.getPrecoPorItem());
        System.out.println("Total da Fatura: " + minhaFatura.getTotalFatura());
    }
}

