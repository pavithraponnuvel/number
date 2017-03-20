
package guvi;

import java.util.Scanner;

public class Guvi {

   
    public static void main(String[] args) {
      
        int[] a=new int[50];
      Scanner sc=new Scanner(System.in);
      int i,j;
      for(i=1;i<=50;i++){
          a[i]=sc.nextInt();
      }
       for(i=1;i<=50;i++){
           for(j=i+1;j<=50;j++){
               int t;
               if(a[i]<a[j]){
               t=a[i];
               a[i]=a[j];
               a[j]=t;}
           }
       }
        System.out.println("The 4th height Student="+a[4]);        
       int k=sc.nextInt();
       System.out.println("enter the kth value="+k);
        System.out.println("kth height Student="+a[k]);
    }
    
}
