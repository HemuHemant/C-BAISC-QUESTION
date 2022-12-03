import java.util.Scanner;

public class lec13_rev {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        String str=Integer.toString(n);
        StringBuffer sb=new StringBuffer(str);
        sb=sb.reverse();
        n=Integer.parseInt(sb.toString());
        System.out.println(n);
    }
}
