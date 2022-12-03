import java.util.Scanner;

public class lec11_vovel_print {
   public static void main(String[] args) {
    //print vovel in given string program
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the string value");
    String str=s.nextLine();
    String value;
    for(int i=0;i<str.length();i++){
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A'
                    || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U')
                    {
                        System.out.print(str.charAt(i)+" ");

                    }
                    else
                    {
                        continue;
                    }

    }
   } 
}
