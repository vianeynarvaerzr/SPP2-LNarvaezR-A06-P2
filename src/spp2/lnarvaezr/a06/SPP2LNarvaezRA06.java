/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.a06;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRA06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int factorial=1, num;
    System.out.print("Introduce un numero");
    num = teclado.nextInt();
    if(num>=1 && num<=10){
        for(int i=num; i>0; i--)
        {
        factorial=i*factorial;
        }
        System.out.println("El factorial del numero es "+ factorial);
    }else{
        System.out.println("Fuera de rango");
                }
    }
    }
    

