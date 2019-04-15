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
public class Calculadora {
    public static float soma(Scanner teclado,float memoria){
        System.out.println("Digite o numero que queira somar a memoria: ");
        float aux = teclado.nextFloat();
        memoria+=aux;
        return memoria;
    }
    
    public static float subtrair(Scanner teclado,float memoria){
        System.out.println("Digite o numero que queira subtrair da memoria: ");
        float aux = teclado.nextFloat();
        memoria-=aux;
        return memoria;
    }
    
    public static float multiplicar(Scanner teclado,float memoria){
        System.out.println("Digite o numero que queira multiplicar a memoria: ");
        float aux = teclado.nextFloat();
        memoria*=aux;
        return memoria;
    }
    
    public static float dividir(Scanner teclado,float memoria){
        System.out.println("Digite o numero que queira dividir a memoria: ");
        float aux = teclado.nextFloat();
        memoria/=aux;
        return memoria;
    }
}
