/**
 * RootOfQE
 */
import java.util.*;

public class RootOfQE {
    public static void main(String[] args) {
        
        System.out.println("To find roots of the QE(ax^2+bx+c=0), enter a,b and c-");

        Scanner sc=new Scanner(System.in);

        
        int a,b,c;
        double y,r1,r2; 


        System.out.print("eneter a- ");
        a=sc.nextInt();
        System.out.print("enter b- ");
        b=sc.nextInt();
        System.out.print("enter c- ");
        c=sc.nextInt();

        y=Math.sqrt((b*b)-4*a*c);
        r1=((-b)+y)/(2*a);
        r2=((-b)-y)/(2*a);
    
        System.out.println("The first root is- "+r1);
        System.out.println("The second root is- "+r2);
        
        sc.close();
    }
    
}