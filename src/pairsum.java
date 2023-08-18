public class pairsum {
    public static void main(String[] args) {
        int []a={1,2,4,5,7};
        int []b={5,6,3,4,8};
        int x=9;
        for(int i=0;i<a.length;i++){
            for (int j = 0; j <b.length ; j++) {
                if(a[i]+b[j]==x){
                    System.out.print(a[i]+" "+b[j]);
                    System.out.println();
                }
            }
        }
    }
}
