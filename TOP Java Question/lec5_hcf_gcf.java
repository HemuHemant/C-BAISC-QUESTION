import java.util.Scanner;

public class lec5_hcf_gcf {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter two number");
    int a = s.nextInt();
    int b = s.nextInt();
    int g = 0;
    for (int i = 1; i <= a; i++) {// both a and b valid
      if (a % i == 0 && b % i == 0) {
        g = i;
      }
    }
    System.out.println("HCF IS=> " + g);
  }
}
