/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verificar.numero.primo;

/**
 *
 * @author zagreu
 */
public class Verificador {
    
    Integer verificadorNumeroPrimo(Integer numero){
        
        Integer i = 1;
        Integer qtdDivisores = 0;
        
        while (i <= numero) {
            if(numero % i == 0){
                qtdDivisores++;
            }
                i++;
        }
        return qtdDivisores;
    }
}
