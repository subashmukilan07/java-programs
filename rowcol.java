class rowcol{
    public static void main(String[] args){
       int n = 5;
       for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            int start=(j-1)*n+1;
            if (j%2==1){
                System.out.print((start +n-i)+" ");
            }else{
                System.out.print((start + i - 1)+" ");
            }
        }
        System.out.println();
       }
     