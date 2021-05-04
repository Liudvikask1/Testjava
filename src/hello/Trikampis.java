package hello;

import java.util.Scanner;


/*
    sukurti metoda trikampio ploto paskaiciavimui (Herono formule)
    i metoda paduodami 3 karstiniu ilgiai (visi double)
    metodas grazina double

    jei trikampis nesusidaro - metodas turi grazinti -1.0

    Math.sqrt(___) - istraukia kvadratine sakni

https://lt.wikibooks.org/wiki/Herono_formul%C4%97

    patikrinti:
    normalus trikampis 3, 4, 5
    ne trikampis 3, 14, 5
    neigiami ilgiai -3, 2, 7
 */
public class Trikampis {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite pirmosios krastines ilgi:");
        int k1 = sc.nextInt();
        System.out.println("Iveskite antrosios krastines ilgi:");
        int k2 = sc.nextInt();
        System.out.println("Iveskite treciosios krastines ilgi:");
        int k3 = sc.nextInt();
        
        if (k1 <= 0 || k2 <= 0 || k3 <= 0) {
            System.out.println("Vienos krastines ilgis neteisingas");
        } else {     
        
        double p = (int) suma(k1, k2, k3) / 2;        
        System.out.println("trikampio pusperimetris yra:" + p);
        
        double plotas = Math.sqrt(p * (p - k1) * (p - k2) * (p - k3));
                
        System.out.println(plotas);
        }
}
        public static double suma(double k1, double k2, double k3) {
            double suma = k1 + k2 + k3;

            return suma;}
    }
      



