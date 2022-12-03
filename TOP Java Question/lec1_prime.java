import java.util.Scanner;
public class lec1_prime {

    public static void main(String []args){
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number");
        int n=s.nextInt();
        int temp=0;
        
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                temp=temp+1;
                break;
            }
        }
        if(temp>0){
            System.out.print("Not a prime number");
        }
        else
        {
            System.out.print("Prime number");
        }

    }
}
