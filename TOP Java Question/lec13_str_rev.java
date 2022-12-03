import java.util.Scanner;

public class lec13_str_rev {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the string value");
    String str=s.nextLine();
    StringBuffer rev=new StringBuffer(str);
    rev=rev.reverse();
    System.out.println(rev+" ");

   } 
}
