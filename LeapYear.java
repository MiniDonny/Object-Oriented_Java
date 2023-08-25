/*Makes the user enter a year by keyboard and responds if it is a leap year or not*/

import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);
        int año;

        System.out.print("Introduzca Año" + " " + "=" + " ");
        año = sc.nextInt();

        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0){
            System.out.println("Es Un Año Bisiesto");
        } else {
            System.out.println("No Es Un Año Bisiesto");
        }
        sc.close();
    }
}