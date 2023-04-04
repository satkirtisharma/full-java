public class Logical_operator {
    public static void main(String[] args) {
        // && Logica AND both are true gives true
        System.out.println((3<2)&&(3>2));
        System.out.println((3>2)&&(5>2));
        // || Logical OR any of the one true gives true
        System.out.println((3<2)||(3>2));
        System.out.println((1>2)||(0>2));
    // ! logical not opposite the boolean value
        System.out.println(!false);
        System.out.println(!true);
    }
}
