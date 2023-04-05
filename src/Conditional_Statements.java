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
    }
}
