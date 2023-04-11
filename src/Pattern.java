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
//        char c='A';
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(c);
//                c++;
//            }
//           // c='A';
//            System.out.println();
//        }
//        //print character patter
//         c='A';
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(c);
//                c++;
//            }
//            c='A';
//            System.out.println();
//        }
        //hollow rectangle pattern
//
//        //Inverted and rotate half pyramid
//        x=5;
//        for (int i = 0; i <x; i++) {
//            for (int j = 0; j <x; j++) {
//                if(i+j>=x-1){
//                    System.out.print("*");
//                }else System.out.print(" ");
//            }
//            System.out.println();
//        }
//        //INVERTED HALF PYRAMID WITH NUMBERS
//        for (int i = 0; i <5; i++) {
//            for (int j =1; j <=5-i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        //floyd's Triangle
//        x=7;
//        int n=1;
//        for (int i = 0; i <x; i++) {
//            for (int j = 1; j <= x-i ;j++) {
//                System.out.print(n+" ");
//                n++;
//            }
//            System.out.println();
//        }
//        //0-1 Triangle
//        x=5;
//        for (int i = 1; i <=x; i++) {
//            for (int j = 1; j <= i ;j++) {
//                if ((i+j)%2==0) System.out.print("1");
//                else System.out.print("0");
//            }
//            System.out.println();
//        }
//        //Butterfly Pattern
//        x=4;
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= 2*(x-i); j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = x; i >= 1; i--) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= 2*(x-i); j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        //SOLID RHOMBUS PATTERN
//        x=5;
//        for (int i = 1; i <=x ; i++) {
//            for (int j = 1; j <=x-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=x; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //hollow rohmbus
//        x=5;
//        for (int i = 1; i <=x ; i++) {
//            for (int j = 1; j <=x-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=x; j++) {
//                if(i==1||i==x||j==1||j==x)System.out.print("*");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//        //DIAMOND PATTERN
//        x=4;
//        for (int i = 1; i <=x; i++) {
//            for (int j = 1; j <=x-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <2*i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = x; i >=1; i--) {
//            for (int j = 1; j <=x-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <2*i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //Number pyramid
//        x=5;
//        for (int i = 1; i <=x ; i++) {
//            for (int j = 1; j <=x-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
    //PALINDROMIC PATTERN WITH NUMBERS IN JAVA
        x=5;
        for (int i = 1; i <=x; i++) {
            for (int j = 1; j <=x-i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
        



