/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desconto.progressivo;

/**
 *
 * @author zagreu
 */
public class CalculadorDesconto {
    
    Double calcularDesconto(Double valorUnitario, Integer quantidade){
        Double valorTotal = valorUnitario * quantidade;
        Double porcentagemDesconto;
        
        if(quantidade == 1){
            porcentagemDesconto = valorTotal * 0.10; 
        }else if (quantidade == 2) {
            porcentagemDesconto = valorTotal * 0.20; 
        }else{
            porcentagemDesconto = valorTotal * 0.30; 
        }
        
        Double valorDescontado = valorTotal - porcentagemDesconto;
        return  valorDescontado;
    }
}
