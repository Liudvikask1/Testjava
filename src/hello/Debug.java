package hello;

public class Debug {
    
    public static void main(String[] args) {
        int i = 3;
        int j = 6;
        
        for (int z = 0; z < 10; z++) {
            i += z;
            j -= z;
        }
        System.out.println(i);
        System.out.println(j);
    }
    
}
