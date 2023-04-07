public class LOOPS {
    public static void main(String[] args) {
        int x=0;
        while(x<=10){
            System.out.println(x++);
        }
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }
        //Square pattern
        for (int i = 1; i <=4 ; i++) {
            System.out.println("****");
        }
        //sum of first 5 natural numbers
        int sum=0;
        for (int i = 0; i <=5 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
        // break and continue;
        //print 1 to 10 numbers other than 5
        for (int i = 1; i <=10; i++) {
           if (i==5)continue;
            System.out.print(i+" ");
        }
        System.out.println();
        //print number 1 to 10 but when 7 is come it is come out from the loop
        for (int i =   1; i <=10; i++) {
            if(i==7)break;
            System.out.print(i+ " ");
        }
        System.out.println("break from loop");
        // do while loop
        //print hello world 10 times
        int counter=1;
        do {
            System.out.println("hello world");
            counter++;
        }while (counter<=10);
    }
}
