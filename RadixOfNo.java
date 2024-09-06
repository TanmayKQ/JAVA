import java.util.Scanner;

/**
 * RadixOfNo
 */
public class RadixOfNo {

    public static void main(String[] args) {
        
        String num;

        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number- ");
        num=sc.nextLine();

        if (num.matches("[0-1]+")) 
        {
            System.out.println("the number is binary, Radix=2");
            
        }
        else if (num.matches("[0-7]+")) 
        {
            System.out.println("the num is octal, Radix=8");   
        }
        
        else if (num.matches("[0-9]+")) 
        {
            System.out.println("the num is decimal, Radix=10");
        }
        else if (num.matches("[0-9A-F]+")) 
        {
            System.out.println("the num is hexadecimal, Radix=16");   
        }
        else 
        {
            System.out.println("not a number");
        }


        sc.close();

    }

}