import java.util.*;

public class SumOfNno {
    public static void main(String[] args ){

        Scanner sc=new Scanner(System.in);

        int n;

        System.out.print("enter the number- ");
        n=sc.nextInt();

       int a=0;
       
        for(int i=1; i<=n; ++i){
            a += i;

        }

        System.out.println("sum is- " +a);

        sc.close();

        


    }
}