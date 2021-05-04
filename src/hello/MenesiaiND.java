package hello;

import java.util.Scanner;

public class MenesiaiND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                 System.out.println("Ivesk menesio numeri:");
         int men = sc.nextInt();
                 switch (men) {
            case 1 -> System.out.println("Sausis");
            case 2 -> System.out.println("Vasaris");
            case 3 -> System.out.println("Kovas");
            case 4 -> System.out.println("Balandis");
            case 5 -> System.out.println("Geguze");
            case 6 -> System.out.println("Birzelis");
            case 7 -> System.out.println("Liepa");
            case 8 -> System.out.println("Rugpjutis");
            case 9 -> System.out.println("Rugsejis");
            case 10 -> System.out.println("Spalis");
            case 11 -> System.out.println("Lapkritis");
            case 12 -> System.out.println("Gruodis");
            default -> {System.out.println("nera tokio menesio");
            }
        }
         switch (men) {
            case 1, 2, 12 -> System.out.println("Ziema");  
            case 3, 4, 5 -> System.out.println("Pavasaris");  
            case 6, 7, 8 -> System.out.println("Vasara");  
            case 9, 10, 11 -> System.out.println("Ruduo");  
            default -> {System.out.println("nera tokio sezono");
            }
        }
    }
}
