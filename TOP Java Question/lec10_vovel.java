import java.util.Scanner;

public class lec10_vovel {
    public static void main(String[] args) {
        //Remove vovel in given string program
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string value");
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A'
                    || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U')

            {
                continue;
            } else {
                System.out.println(str.charAt(i));
            }
        }
    }
}
