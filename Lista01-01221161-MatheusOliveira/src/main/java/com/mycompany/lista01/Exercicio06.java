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
public class Exercicio06 {
    
    public static void main(String[] args) {
        
        Scanner scannerNumerico = new Scanner(System.in);
        
        System.out.println("Digite seu salário bruto:");
        Double salarioBruto = scannerNumerico.nextDouble();
        
        Double descontoInss = (salarioBruto * 0.10) / 1;
        Double descontoIr = (salarioBruto * 0.20) / 1;
        
        
        System.out.println("Digite o custo da condução diária de ida para o trabalho:");
        Double valorConducao = scannerNumerico.nextDouble();
        
        Double gastoMensalConducao = valorConducao * 2 * 22;
        
        Double valorTotalDescontos = descontoInss + descontoIr + gastoMensalConducao;
        
        Double salarioLiquido = ((salarioBruto - descontoInss) - descontoIr) - gastoMensalConducao;
        
        String frase = String.format("Seu salário bruto é R$%.2f, "
                + "tem um total de R$%.2f em descontos e "
                + "receberá um líquido de R$%.2f",
                salarioBruto, valorTotalDescontos, salarioLiquido);
        
        System.out.println(frase);
    }
}
