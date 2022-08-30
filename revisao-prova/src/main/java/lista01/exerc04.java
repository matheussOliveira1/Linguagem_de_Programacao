/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class exerc04 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o valor unitário do produto:");
        Double valorUnitario = in.nextDouble();
        
        System.out.println("Digite a quantidade vendida:");
        Integer qtdVendida = in.nextInt();
        
        System.out.println("Digite o valor pago:");
        Double valorPago = in.nextDouble();
        
        Double valorTotalProduto = valorUnitario * qtdVendida;
        Double trocoProduto = valorPago - valorTotalProduto;
        
        String frase = String.format("Seu troco será de R$ %.2f", trocoProduto);
        System.out.println(frase);
    }
}
