import java.util.*;
public class Function {
    public static void printhelloworld (){
        System.out.println("Hello World");
    }
    public static void printhelloworld (int x){
        for (int i = 0; i < x; i++) {
            System.out.println("Hello World");
        }
    }

    public static  int sum(int a,int b) {
       return a+b;
    }

    public static void main(String[] args) {
        printhelloworld();//void function without parameter
        printhelloworld(5);//void function with parameter
        int x=sum(5,6);//function with int return type
        System.out.println(x);
        int arr[]={1,2324,234,12,41,142,14};
        Arrays.sort(arr);
    }
}
