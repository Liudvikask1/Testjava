package hello;

public class Fibonacci {
    public static void fib(long s1, long s2, long max) {
        System.out.println(s1);
        long next = s1 + s2;
        if (next > max) {
            System.out.println(s2);
        } else {
            fib(s2, next,max);
        }        
    }
    
    public static void main(String[] args) {       
        fib (1, 1, 1000);        
    }
}  
    

 /*
    Parasyti metoda (rekursija), kuris spausdina sekanti Fibonaci skaiciu
    ir jei naujas skaicius < max iskviesti pats save su sekancia skaiciu pora

    public static void fib(long s1, long s2, long max) {
        // cia turi buti jusu ND
            fib(1, 1, 5000);
    }

    public static void printArray(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
 
        int[][] masyvas = {
            {5, 6, 7, 8, 9, 0},
            {},
            {1, 2, 3},
            {1, 2, 3, 5, 6, 7, 8, 9}
        };
 
        printArray(masyvas);
    }
    */