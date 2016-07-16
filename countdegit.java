package guvi;
import java.util.Scanner;
public class countdegit {
    public static void main(String[] args) {
        int num;
        System.out.println("enter the no:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
int length = (int) Math.log10(num) + 1;
System.out.println(length);

    }
    
}
