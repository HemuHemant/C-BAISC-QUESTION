import java.util.Scanner;

public class lec12_str_rev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string value");

        String a = s.nextLine();// exaple is =>Hemant
        ;// like temp ,empaty hai ye
        int ptr = a.length() - 1;// ptr=6-1>ptr=>5
        
        String str2=a;
        String b="";
//this out not giving palidrome pls solve it
        while (ptr >= 0) {
            b = b + a.charAt(ptr);// 0+5=>b=>5 means t print
            ptr--;
        }
        if(str2==b){
            System.out.println("Palidrome string");
        }
        else
        {
            System.out.println("NOt string is palidrome");
        }
    }
}
