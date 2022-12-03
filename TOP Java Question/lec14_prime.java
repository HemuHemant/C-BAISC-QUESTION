import java.util.Scanner;



public class lec14_prime {
   public static void main(String[] args) {
    int i,j;
    System.out.println("enter the two number");
    Scanner s =new Scanner(System.in);
    int n1=s.nextInt();
    int n2=s.nextInt();
    for( i=n1;i<=n2;i++)
    {
        for(j=2;j<=i;j++)
        {
            if(i%j==0)
            break;
        }
        if(i==j)
    {
        System.out.print(j+ " ");
    }

    }
    
   } 
}
