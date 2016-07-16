import java.util.Scanner;
public class numbers {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the value");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n > 0)
        System.out.println("Number is POSITIVE");
    else if(n < 0)
       System.out.println("Number is NEGATIVE");
    else
        System.out.println("Number is ZERO");
    }
}
