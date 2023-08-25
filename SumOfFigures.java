/*Enter a number on the keyboard and add your digits*/

import java.util.*;

public class SumOfFigures {
     public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int num;  
        int resultado = 0; 
        
        System.out.print("Introduzca Un Número Entero" + " " + "=" + " ");
        num = sc.nextInt();
    
        while(num > 0){
            resultado += num % 10;
            num = num / 10;
        } 

        System.out.print("La Suma es" +  " " + "=" + " " + resultado);

        System.out.println("\nFin Del Programa");

        sc.close();
    }
}
