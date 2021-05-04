package hello;

import java.util.Scanner;

public class Greedy2 {

       public static int kauliukoMetimas() {
        return (int) (Math.random() * 6 + 1);
    }
 
    public static void main(String[] args) {
        int k1t = 0;
        int k2t = 0;
 
        do {
            int k1m;
            int k1mt = 0;
            int k1mk = 0;
            System.out.print("Comp1: ");
            do {
                k1m = kauliukoMetimas();
                System.out.print(k1m);
                System.out.print(" ");
                if (k1m != 1) {
                    k1mt += k1m;
                }
            } while (k1m != 1 && ++k1mk < 5 && k1mt + k1t < 100);
            if (k1m != 1) {
                k1t += k1mt;
            }
            System.out.println(k1t);
            if (k1t < 100) {
                int k2m;
                int k2mt = 0;
                System.out.print("Comp2: ");
                do {
                    k2m = kauliukoMetimas();
                    System.out.print(k2m);
                    System.out.print(" ");
                    if (k2m != 1) {
                        k2mt += k2m;
                    }
                } while (k2m != 1 && k2mt < 18 && k2mt + k2t < 100);
                if (k2m != 1) {
                    k2t += k2mt;
                }
                System.out.println(k2t);
            }
        } while (k1t < 100 && k2t < 100);
        if (k1t > k2t) {
            System.out.println("Laimejo 1-as kompiuteris");
        } else {
            System.out.println("Laimejo 2-as kompiuteris");
        }
    }
}

/*
    Greedy pig

    Zaidziama su vienu kauliuku 1..6

    Tikslas surinkti 100 tasku.

    zaidejas meta
        jei isrideno 2..6 gali ridenti dar karta
        jei isrideno 1 - to ejimo taskai nunulinami ir ejimas pereina kitam zaidejui
      zaidejas (jei isrideno 2..6) gali pasirinkti ar mesti dar karta
      ar pasiimti taskus ir perleisti eima kitam zaidejui

    Z1          Z2
    10  10      0  0
    8   18      23 23
    0   18      9  32

    Z1:
    isrideno 3
    isrideno 5
    isrideno 2
    stop

    Z2:
    isrideno 6
    isrideno 1

    Z1:
    isrideno 4
    isrideno 4
    stop

    Z2:
    isrideno 6
    isrideno 5
    isrideno 6
    isrideno 6
    stop

    Z1:
    isrideno 1

    Z2:
    isrideno 3
    isrideno 2
    isrideno 4
    stop
 
    kol kuris nors is zaideju surenka 100


    Leisti zmogui pasirinkti ar reidenti ar sustoti

    Kompiuteris zaidzia:
    1. bando isridenti 5 kartus is eiles
    ***
    2. bando pasiekti 18 tasku

    ***************
    Tegu zaidzia kompiuteris su savim - 2 skirtingos strategijos

    comp1: 4 3 6 2 3 = 18 (18)
    comp2: 6 5 6 1 = 0 (0)
    comp1: 1 = 0 (18)
    comp2: 4 5 6 2 2 = 19 (19)
    comp1: 3 3 3 3 3 = 15 (33)
    ...
 */
