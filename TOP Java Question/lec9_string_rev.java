import java.util.Scanner;

public class lec9_string_rev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string value");

        String a = s.nextLine();// exaple is =>Hemant
        String b = "";// like temp ,empaty hai ye
        int ptr = a.length() - 1;// ptr=6-1>ptr=>5

        while (ptr >= 0) {
            b = b + a.charAt(ptr);// 0+5=>b=>5 means t print
            ptr--;
        }
        System.out.println(b);
    }
}
