/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech2.lista02.matheusoliveira;

/**
 *
 * @author zagreu
 */
public class Exercicio08 {

    public static void main(String[] args) {
        //ContadorVariado

        for (Double valor = 0.00; valor < 5; valor += 0.15) {
            String valores = String.format("%.2f", valor);
            System.out.println(valores);
        }
    }
}
