/*Makes the user enter a number on the keyboard and responds if it is capicua or not*/ 

import java.util.*;

public class NumberCapicua{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduzca Un Número De Tres Cifras" + " " + "=" + " ");
        num = sc.nextInt();

        if ( num >= 100 && num <=999){
            System.out.println("El Número Es De Tres Cifras");
            if ( num % 10 == num / 100 ){
                System.out.println("El Número Es Capicúa");
            } else {
                System.out.println("El Número No Es Capicúa");
            }
        } else{
            System.out.println("El Número No Es De Tres Cifras");
        }
            sc.close();
    }
}