/**
 * Menu
 */
import java.util.*;

 public class Menu {

    public static void main(String[] args) {
        String option;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 nos.:- ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("the options are :- \nadd \nsub \nmul \ndiv.");
        System.out.print("eneter option in words:- ");
        option=sc.nextLine();
        option=sc.nextLine();

       sc.close();
        
        switch (option) {
            case "add":
                System.out.println("addition is:- "+(a+b));
                break;
            case "sub":
                System.out.println("substraction is:- "+(a-b));
                break;    
            case "mul":
                System.out.println("multiplication is:- "+(a*b));
                break;
            case "div":
                System.out.println("division is:- "+(b/a));
                break;    
            default:
                System.out.println("invalid option");
                break;
        }


    }
}