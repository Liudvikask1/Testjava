package hello;

public class Masyvai {
    
    public static void main(String[] args) {
        /*
        sukurti kvadratini masyva,
        kurio eiluciu kiekis lygus duoto masyvo elementu kiekiui

        uzpildyti kvadratini masyva tokiu budu:
        1, 2, 3, 4, 5
        2, 3, 4, 5, 1
        3, 4, 5, 1, 2
        4, 5, 1, 2, 3
        5, 1, 2, 3, 4
        atspausdinti

        uzpildyti kvadratini masyva tokiu budu:
        1, 2, 3, 4, 5
        5, 1, 2, 3, 4
        4, 5, 1, 2, 3
        3, 4, 5, 1, 2
        2, 3, 4, 5, 1
        atspausdinti
        */
       int[] m = {1, 2, 3};
 
        int[][] kv = new int[m.length][m.length];
 
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                kv[i][(j + i) % m.length] = m[j];
            }
        }
        for (int i = 0; i < kv.length; i++) {
            for (int j = 0; j < kv[i].length; j++) {
                System.out.print(kv[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println("------");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                kv[i][j] = m[(j + i) % m.length];
            }
        }
        for (int i = 0; i < kv.length; i++) {
            for (int j = 0; j < kv[i].length; j++) {
                System.out.print(kv[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}