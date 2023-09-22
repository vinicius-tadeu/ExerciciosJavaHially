/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto;

/**
 *
 * @author vinicius.tadeu
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Projeto {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de Pessoa
        System.out.println("Cadastro de Pessoa");
        System.out.print("Nome: ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Idade: ");
        int idadePessoa = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        // Cadastro de Pet
        System.out.println("\nCadastro de Pet");
        System.out.print("Nome do Pet: ");
        String nomePet = scanner.nextLine();
        System.out.print("Espécie: ");
        String especiePet = scanner.nextLine();

        // Cadastro de Veículo
        System.out.println("\nCadastro de Veículo");
        String marcaVeiculo = JOptionPane.showInputDialog("Marca do Veículo:");
        String modeloVeiculo = JOptionPane.showInputDialog("Modelo do Veículo:");
        String placaVeiculo = JOptionPane.showInputDialog("Placa do Veículo:");

        // Exibir os dados cadastrados
        System.out.println("\nDados Cadastrados:");
        System.out.println("Nome da Pessoa: " + nomePessoa);
        System.out.println("Idade da Pessoa: " + idadePessoa);
        System.out.println("Nome do Pet: " + nomePet);
        System.out.println("Espécie do Pet: " + especiePet);
        System.out.println("Marca do Veículo: " + marcaVeiculo);
        System.out.println("Modelo do Veículo: " + modeloVeiculo);
        System.out.println("Placa do Veículo: " + placaVeiculo);

        // Fechar o scanner
        scanner.close();
    }
}
