/**
 * WebType
 */
import java.util.*;

 public class WebType {
    public static void main(String[] args) {
        String url;
        Scanner sc=new Scanner(System.in);
        System.err.println("eneter URL");
        url=sc.nextLine();

        String proto=url.substring(0, url.indexOf(":"));

        if (proto.equals("http")) {
            System.out.println("hypertext transfer protocol");
        }
        else  if (proto.equals("ftp")) {
            System.out.println("file transfer protocol");
        }
        

        String ext=url.substring(url.lastIndexOf(".")+1);

        if (ext.equals("com")) {
            System.out.println("commercial");
        }
        else if (ext.equals("org")) {
            System.out.println("organisation");
        }
        else if (ext.equals("net")) {
            System.out.println("network");
        }
    
        sc.close();
    
    }
}