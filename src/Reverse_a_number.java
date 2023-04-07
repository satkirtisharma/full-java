public class Reverse_a_number {
    public static void main(String[] args) {
        int originalnumber=21052003,reversenumber=0;
        for (int i = 0; originalnumber>0; i++) {
            int lastdigit=originalnumber%10;
            reversenumber+=lastdigit;
            reversenumber*=10;
            originalnumber/=10;
        }
        System.out.println(reversenumber);
    }
}
