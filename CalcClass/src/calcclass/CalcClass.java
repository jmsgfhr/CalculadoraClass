/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcclass;

import java.util.Scanner;

/**
 *
 * @author jmsgfhr
 */
public class CalcClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float memoria=0;
        menucalc(memoria);
    }
    
    public static void menucalc(float memoria){
       Scanner teclado = new Scanner(System.in);
       System.out.println("Estado da memória: "+memoria+"\nOpções:\n(1) Somar\n(2) Subtrair\n(3) Multiplicar\n(4) Dividir\n(5) Limpar memória\n(6) Sair do programa\nQual opção você deseja?");
       int resp = teclado.nextInt();
       if((resp>0)||(resp<7)){
           switch (resp){
               case 1:
                   memoria=Calculadora.soma(teclado, memoria);
                   menucalc(memoria);
                   break;
               case 2:
                   memoria=Calculadora.subtrair(teclado,memoria);
                   menucalc(memoria);
                   break;
               case 3:
                   memoria=Calculadora.multiplicar(teclado,memoria);
                   menucalc(memoria);
                   break;
               case 4:
                   memoria=Calculadora.dividir(teclado,memoria);
                   menucalc(memoria);
                   break;
               case 5:
                   menucalc(0);
                   break;
               case 6:
                   System.out.println("Muito obrigado por usar o programa :hangloose:");
                   System.exit(0);
           }
       }else
            System.out.println("Opção invalida!!!\n\n");
    }
}
