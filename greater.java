import java.util.List;
import java.util.Scanner;
public class Guvi {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter the element");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b&&a>c)
            System.out.println("greater no is="+a);
        else if(b>c)
            System.out.println("greater no is="+b);
        else
            System.out.println("greater no is="+c);
       }
}
