import java.util.Scanner;

public class lec13_rev_str_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n number");
        int n = s.nextInt();
        String str = Integer.toString(n);
        StringBuffer sb = new StringBuffer(str);
        sb = sb.reverse();
        n = Integer.parseInt(sb.toString());
        System.out.println(n);
    }
}
