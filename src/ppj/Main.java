package ppj;

public class Main {

    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 7;
        double d1 = 3.52;
        double d2 = -8.32;

        int i = i1 + i2;
        System.out.println(i);

        double d = d1 + d2;
        System.out.println(d);

        d = d + i1 + i2;
        System.out.println(d);

        i = i1 * i2;
        System.out.println(i);
        i = i2 * i1;
        System.out.println(i);

        System.out.println(i1 % i2);
        System.out.println(i2 % i1);
        d1 = i1;
        System.out.println(d1);
        i2 = (int) d2;
        System.out.println(i2);
        i2++;
        System.out.println(i2);

    }

}
