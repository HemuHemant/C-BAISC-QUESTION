import java.util.Scanner;

public class lec4_hcf_logic {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the two value");
    int a=s.nextInt();
    int b=s.nextInt();
    //int hcf;
    for(int i=1;i<=a;i++){
        if(a%i==0 && b%i==0){
            System.out.println(i+" ");
        }
    }
   } 
}
