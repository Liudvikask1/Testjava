package hello;

import java.util.Scanner;

public class Greedy {

     public static int kauliukoMetimas() {
        return (int) (Math.random() * 6 + 1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zt = 0;
        int kt = 0;
 
        do {
            int zmt = 0;
            int zm;
            do {
                zm = kauliukoMetimas();
                System.out.println(zm);
                if (zm != 1) {
                    zmt += zm;
                    System.out.println(zmt);
                    if (zt + zmt < 100) {
                        System.out.println("Metam dar karta? 1/0 ");
                        int darKarta = sc.nextInt();
                        if (darKarta == 0) {
                            zt += zmt;
                            zm = 1;
                        }
                    } else {
                        zt += zmt;
                        zm = 1;
                    }
                }
            } while (zm != 1);
            System.out.println(zt);
            if (zt < 100) {
                int km;
                int kmt = 0;
                int kmk = 0;
                do {
                    km = kauliukoMetimas();
                    System.out.print(km);
                    System.out.print(" ");
                    if (km != 1) {
                        kmt += km;
                    }
                } while (km != 1 && ++kmk < 5 && kmt + kt < 100);
                if (km != 1) {
                    kt += kmt;
                }
                System.out.println(kt);
            }
        } while (zt < 100 && kt < 100);
        if (zt > kt) {
            System.out.println("Laimejo zaidejas");
        } else {
            System.out.println("Laimejo kompiuteris");
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
