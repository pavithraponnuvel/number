public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,i,j,k,s1=0,s2=0,p,q,m;
        n1=sc.nextInt();
        int[][] a=new int[n1][n1];
        int[] r=new int[n1*n1];
        int[] c=new int[n1*n1];
     for(i=0;i<n1;i++){
         for(j=0;j<n1;j++){
            a[i][j]=sc.nextInt(); }
     }
      for(i=0;i<n1;i++){
         for(j=0;j<n1;j++){
            if(a[i][j]==0){
               r[s1]=i;s1++;
               c[s2]=j;
               s2++;
            }}}
                for(k=0;k<s1;k++){
                     p=r[k];
                     q=c[k];
                     for(m=0;m<n1;m++){
                    for(n2=0;n2<n1;n2++){
                       a[p][n2]=0;
                       a[m][q]=0;   
                    }
                        }
                    }
       for(i=0;i<n1;i++){
           System.out.println("\n");
         for(j=0;j<n1;j++){
             System.out.print(" "+a[i][j]);
         }
       }
    }
}
