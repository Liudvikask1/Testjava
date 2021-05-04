package hello;

import java.util.Scanner;

public class Hello {

    public static long fakt(long sk) {
        return sk * fakt(sk - 1);
    }

    public static void main(String[] args) {

        int sk = 4;
        System.out.println(fakt(sk));
    }
}
