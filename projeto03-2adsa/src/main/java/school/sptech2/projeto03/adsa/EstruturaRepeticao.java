/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech2.projeto03.adsa;

/**
 *
 * @author Aluno
 */
public class EstruturaRepeticao {
    
    public static void main(String[] args) {
        
        System.out.println("For de 0 a 10");
        for (int j = 0; j <= 10; j++) {
            System.out.println(j);
        }
        
        System.out.println("-".repeat(20));
        
        System.out.println("For de 10 a 0");
        for (Integer  i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        
        System.out.println("-".repeat(20));

        System.out.println("While de 0 a 10");
        Integer k = 0;
        while (k <= 10) {            
            System.out.println(k);
            k++;
        }
        
        System.out.println("-".repeat(20));
        
        System.out.println("While de 10 a 0");
        Integer l = 10;
        while (l >= 0) {            
            System.out.println(l);
            l--;
        }
    }
}
