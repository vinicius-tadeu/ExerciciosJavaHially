/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livro;

/**
 *
 * @author vinicius.tadeu
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private int numPaginas;
    
    
    // Construtor
    public Livro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public void imprimirInfo(){
        System.out.println("Título:" + titulo);
        System.out.println("Autor:" + autor);
        System.out.println("Número de Páginas: " + numPaginas);
    }
    
    
    public static void main(String[] args) {
        // Criando objeto da classe livro
        Livro meuLivro = new Livro("O senhor dos Anéis", "J.R.R. Tolkien", 1178);
        
        // Chamando o método para imprimir informações
        meuLivro.imprimirInfo();
    }
}
