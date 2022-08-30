/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech2.lista02.matheusoliveira;

import java.util.Scanner;

/**
 *
 * @author zagreu
 */
public class Exercicio09 {
    
    public static void main(String[] args) {
        //Votos Pizza
        
        Scanner leitorNumerico = new Scanner(System.in);
        String vencedor;
        
        System.out.println("Vote na sua pizza preferida:\nDigite 5 para mussarela"
                + "\nDigite 25 para calabresa \nDigite 50 para quatro queijos");
        Integer votoDigitado = leitorNumerico.nextInt();
        
        Integer votosMussarela = 0;
        Integer votosCalabresa = 0;
        Integer votosQuatroQueijos = 0;
        
        if(votoDigitado == 5){
              votosMussarela += 1;  
        }else if(votoDigitado == 25){
                votosCalabresa += 1;
        }else if(votoDigitado == 50){
                votosQuatroQueijos += 1;
        }
        
        for (int i = 1; i < 10; i++) {
            System.out.println("Boa escolha! Próximo voto:");
            votoDigitado = leitorNumerico.nextInt();
            if(votoDigitado == 5){
              votosMussarela += 1;  
            }else if(votoDigitado == 25){
                votosCalabresa += 1;
            }else if(votoDigitado == 50){
                votosQuatroQueijos += 1;
            }
        }
        if(votosMussarela > votosCalabresa && votosMussarela > votosQuatroQueijos){
            vencedor = "Mussarela";
        }else if(votosCalabresa > votosMussarela && votosCalabresa > votosQuatroQueijos){
            vencedor = "Calabresa";
        }else{
            vencedor = "Quatro Queijos";
        }
        
        String quantidadeVotosFinal = String.format("Resultados: \nMussarela: %d"
                + "\nCalabresa: %d"
                + "\nQuatro Queijos: %d"
                + "\nSabor vencedor: %s", 
                votosMussarela, votosCalabresa, votosQuatroQueijos, vencedor);
        
        System.out.println(quantidadeVotosFinal);
    }
}
