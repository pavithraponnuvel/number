String s,s1="";
        int i,j,l;
        char c1;
        char[] c=new char[100];
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        c=s.toCharArray();
        l=c.length;
        for(i=l-1;i>=0;i--){
           c1=c[i];
            for(j=i-1;j>=0;j--){
                if(c[i]==c[j]){
                    c[j]='\0';
                } 
            }
            s1=s1+c[i];
        }
        System.out.println(""+s1);
    }
    
}