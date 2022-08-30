/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class Exercicio04 {
    
    public static void main(String[] args) {
        
        // Atividade CalculadoraTroco
        
        Scanner scannerNumerico = new Scanner(System.in);
        
        System.out.println("Digite o valor unitário do produto:");
        Double valorProduto = scannerNumerico.nextDouble();
        
        System.out.println("Digite a quantidade vendida:");
        Integer quantidadeVendida = scannerNumerico.nextInt();
        
        System.out.println("Digite o valor pago:");
        Double valorPago = scannerNumerico.nextDouble();
        
        Double valorTotal = quantidadeVendida * valorProduto;
        
        Double valorTroco = valorPago - valorTotal;
        
        String frase = String.format("Seu troco será de R$%.2f", valorTroco);
        System.out.println(frase);
    }
}
