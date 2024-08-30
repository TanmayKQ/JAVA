/**
 * Swapping
 */

import java.util.*;

 public class Swapping {

    public static void main(String[] args) {
        
        int a,b;

        Scanner sc=new Scanner(System.in);
        System.out.print("eneter no. a- ");
        a=sc.nextInt();
        System.out.print("enter no. b- ");
        b=sc.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.print("after swapping, a= "+a+" and b= "+b );
        
        sc.close();
    }
    
}