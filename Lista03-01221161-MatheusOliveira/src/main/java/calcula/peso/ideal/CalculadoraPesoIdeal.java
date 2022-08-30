/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcula.peso.ideal;

/**
 *
 * @author zagreu
 */
public class CalculadoraPesoIdeal {
    
    Double calculaPesoIdeal(Double altura, String sexo){
        Double resultadoPesoIdeal = 0.00;
        if(sexo.equals("F")){
            resultadoPesoIdeal = (62.1 * altura) - 44.7;
        }else if (sexo.equals("M")) {
            resultadoPesoIdeal = (72.7 * altura) - 58;   
        }
        return resultadoPesoIdeal;
    }
}
