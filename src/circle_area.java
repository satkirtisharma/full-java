import java.util.Scanner;

public class circle_area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        float pie=3.14f;
        float area=pie*radius*radius;
        System.out.println(area);
    }
}
