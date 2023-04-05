import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        int age=18;
        if(age<=18){
            System.out.println("adult");
        } else if (age>16&&age<18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("you are child");
        }
        //ternary operator
        int num=101;
       String s=10%2==0?"even":"odd";
        System.out.println(s);
//Calculator  using Switch Case
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int x=sc.nextInt();
        System.out.println("enter second number");
        int y=sc.nextInt();
        System.out.println("enter the operation sign");
        char c=sc.next().charAt(0);
        switch (c){
            case '+' :
                System.out.println(x+y);
                break;
            case '-' :
                System.out.println(x-y);
                break;
            case '*' :
                System.out.println(x*y);
                break;
            case '/' :
                System.out.println(x/y);
                break;
            case '%' :
                System.out.println(x%y);
                break;
            default:
                System.out.println("the calculator is not advanace to perform this operation");


        }
    }
}
