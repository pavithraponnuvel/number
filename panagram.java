        char[] c=new char[100];
         char[] c1=new char[26];
        int n=26,l,i,k=0,j,count=0,l1;
        char t;
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         c=s.toCharArray();
         l=s.length();
         if(l!=n){
             System.out.println("not");
         }else if(n>=26){
         for(t='a';t<='z';t++){
             c1[k]=t;
             k++;
         }
         for(i=0;i<c1.length;i++){
             for(j=0;j<c.length;j++){
                 if(c1[i]==c[j]){
                     c1[i]='\0';
                 } }
                 }
        for(i=0;i<c1.length;i++){ 
            if(c1[i]=='\0'){
                count++;
            }}
             if(count==26){
                 System.out.println("yes");
             }else{
                 System.out.println("no");
             } } }}
