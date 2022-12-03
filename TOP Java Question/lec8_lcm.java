import java.util.Scanner;

public class lec8_lcm {
    public static void main(String[] args) {
       
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=s.nextInt();
        int b=s.nextInt();
        int g=0;
        int lcm;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                g=i;
            }
        }
        lcm=(a*b)/g;
        System.out.println("lcm is => "+lcm);

    }
}
