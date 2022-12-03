import java.util.Scanner;

public class lec7_rev_hcf_logic3 {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter two number");
    int a=s.nextInt();
    int b=s.nextInt();
    
    int g=findGCD(a,b);
    System.out.println("HCF is > "+g);
   }

private static int findGCD(int a, int b) {
    if(a%b==0)
    return b;
    else
    return findGCD(b,a%b);
} 
}
