/**
 * leapyear
 */
import java.util.*;

 public class leapyear {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.print("enter the year- ");
        year=sc.nextInt();

        if (year%4==0) 
        {
            if (year%100==0) 
            {
                if (year%400==0) {
                    System.out.println("leap year");
                    
                }
                else{
                    System.out.println("common year");
                }

            }
            else{
                System.err.println("leap year");

            }

        }
        
        else
        {
            System.err.println("common year");    
        }

        sc.close();

    }       

}