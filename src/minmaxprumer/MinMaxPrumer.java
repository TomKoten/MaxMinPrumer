
package minmaxprumer;

import java.util.Scanner;

public class MinMaxPrumer {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "CP1250");
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        while (true) {
            int vstup = sc.nextInt();
            if (vstup == 0) break;
            if(vstup<min) min = vstup;
            if (vstup>max) max = vstup;
            System.out.println("Nejvetsi: " + max);
            System.out.println("Nejmensi: "+ min);
        }
        
    }
    
}
