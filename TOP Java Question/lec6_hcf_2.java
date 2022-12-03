import java.util.Scanner;

public class lec6_hcf_2 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter two number");
    int a=s.nextInt();
    int b=s.nextInt();
    int r;
    while(a%b!=0){//a=60,b=50;
         r=a%b;//=>60%50=>r=10
        a=b;//a=50
        b=r;//b=10
       
    }
    System.out.print(b);
   
  }  
}
