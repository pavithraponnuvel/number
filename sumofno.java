import java.util.Scanner;
public class sumofNno {
    public static void main(String[] args) {
         int sum = 0 ,n;
         System.out.println("enter the no:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         for(int i = 1 ; i <= n ; i++){
             for(int j = 1 ; j <= i; j++ ){
                sum = sum + j ;
             }
             System.out.println( sum) ;
             sum = 0 ;
         }
    }
}
