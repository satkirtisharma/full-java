import java.util.Scanner;

public class absolute_difference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int abs=0;
        int j=0,k=0;
        for (int w = 0; w <a ; w++) {
        for (int i = 0; i <a ; i++) {
            abs=n-arr[i];
            if(n<0)n*=-1;
            if(arr[i]-n<abs){
                k=arr[i];
                arr[i]=arr[j];
                arr[j]=k;
            }
        }}
        for (int i = 0; i <a ; i++) {
            System.out.println(arr[i]);
        }
    }
}
