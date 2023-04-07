public class Pattern {
    public static void main(String[] args) {
        int x=4;
//        for (int i = 0; i <x; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //print  Inverted-Star pattern
//        for (int i = 0 ; i <x ; i++) {
//            for (int j = 0; j < x-i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //print half pyramid pattern
//        for (int i = 1; i <=x ; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        //print character patter
        char c='A';
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
           // c='A';
            System.out.println();
        }
        //print character patter
         c='A';
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            c='A';
            System.out.println(); 
        }
    }
}
