import java.util.*;

public class AreaOfTriangle {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int a,b,c;
        float s;
        double area;

        System.out.print("Enter side one- ");
        a = sc.nextInt();
        System.out.print("Enter side two- ");
        b = sc.nextInt();
        System.out.print("Enter side three- ");
        c = sc.nextInt();
        s = (a+b+c)/2f ;
        area = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
        sc.close();
        

        System.out.println("The area of triangle is - " +area);
    }
}