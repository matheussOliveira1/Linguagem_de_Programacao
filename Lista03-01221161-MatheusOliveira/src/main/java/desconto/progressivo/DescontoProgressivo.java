/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desconto.progressivo;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class DescontoProgressivo {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        CalculadorDesconto calcDesconto = new CalculadorDesconto();
        
        System.out.println("Bem-vindo ao sistema de desconto progressivo!");
        
        System.out.println("Digite o valor unitário do produto:");
        Double valorDigitado = in.nextDouble();
        
        System.out.println("Digite a quantidade:");
        Integer quantidadeDigitada = in.nextInt();
        
        System.out.println("-".repeat(30));
        System.out.printf("Valor do produto: R$%.2f\n", valorDigitado);
        System.out.printf("Quantidade: %d\n", quantidadeDigitada);
        System.out.println("-".repeat(30));
        
        Double valorComDesconto = calcDesconto.calcularDesconto(valorDigitado, quantidadeDigitada);
        System.out.println("Valor com desconto: R$" + valorComDesconto);
        
    }
}
