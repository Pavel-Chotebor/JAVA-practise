import javax.swing.*;

public class VariableMutation {
    public static void main(String[] args) {

        int a = 3;
        a += 10;
        System.out.println("a:" + a);


        int b = 100;
        b -= 7;
        System.out.println("b:" + b);

        int c = 44;
        c *= 2;
        System.out.println("c:" + c);

        int d = 125;
        d /= 5;
        System.out.println("d:" + d);


        int f1 = 123;
        int f2 = 345;

        boolean fBigger = (f1 > f2);

        System.out.println("f1 is bigger?:" + fBigger);


        int g1 = 350;
        int g2 = 200;

        boolean gBigger = (g2 > g1);
        System.out.println("g2 is bigger?:" + gBigger);

        int h = 135798745;
        System.out.println( h % 11 ==0) ;


        int j = 1521;
        System.out.println( j % 3 ==0 || j % 5 == 0);

    }
}
