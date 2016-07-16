package guvi;
import java.util.Scanner;
public class calculatesum {
    public static void main(String[] args) {
        int n, i, sum = 0;
    System.out.println("Enter a positive integer: ");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
for(i=1; i <= n; ++i){
        sum += i;  
    }
System.out.println("Sum ="+sum);
 }}
