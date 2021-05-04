package hello;

import java.util.Scanner;

public class RockPaperScissorsMano {

    public static void main(String[] args) {
        boolean arZaisti = true;
        while (arZaisti) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasirinkite: 1 - akmuo, 2 - popierius, 3 - zirkles, 0 - pabaiga");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("pabaiga");
            break;
        } else {
            if (a == 1) {
                System.out.println("Jus pasirinkote: " + "akmuo");
            }
            if (a == 2) {
                System.out.println("Jus pasirinkote: " + "popierius");
            }
            if (a == 3) {
                System.out.println("Jus pasirinkote: " + "zirkles");
            } 
        }
        int i = (int) (Math.random() * 3) + 1;
        if (a == 1 && i == 1) {
            System.out.println("Kompiuteris pasirinko: " + "akmuo");
            System.out.println("Rezultatas: lygiosios");
        }
        if (a == 1 && i == 2) {
            System.out.println("Kompiuteris pasirinko: " + "popierius");
            System.out.println("Rezultatas: pralaimejote");
        }
        if (a == 1 && i == 3) {
            System.out.println("Kompiuteris pasirinko: " + "zirkles");
            System.out.println("Rezultatas: laimejote");
        }

        if (a == 2 && i == 1) {
            System.out.println("Kompiuteris pasirinko: " + "akmuo");
            System.out.println("Rezultatas: laimejote");
        }
        if (a == 2 && i == 2) {
            System.out.println("Kompiuteris pasirinko: " + "popierius");
            System.out.println("Rezultatas: lygiosios");
        }
        if (a == 2 && i == 3) {
            System.out.println("Kompiuteris pasirinko: " + "zirkles");
            System.out.println("Rezultatas: pralaimejote");
        }

        if (a == 3 && i == 1) {
            System.out.println("Kompiuteris pasirinko: " + "akmuo");
            System.out.println("Rezultatas: pralaimejote");
        }
        if (a == 3 && i == 2) {
            System.out.println("Kompiuteris pasirinko: " + "popierius");
            System.out.println("Rezultatas: laimejote");
        }
        if (a == 3 && i == 3) {
            System.out.println("Kompiuteris pasirinko: " + "zirkles");
            System.out.println("Rezultatas: lygiosios");
        }
    }
}
}

    /*
    Akmuo - popierius - zirkles

    Programa leidzia vartotojui pasirinkti:

    1. Akmuo
    2. Popierius
    3. Zirkles
    0. Pabaiga

    Jei ne pabaiga:
    Kompiuteris atsitiktinai pasirenka
    palyginam ir parasom kas laimejo

    ir vel spausdinam meniu
    jei vartotojas pasirinko ne 0..3 - pavadinikit vartotjoa mulkiu ir vel meniu

    ****
    Programa paklausia kiek kartu reikia suzaist

    Kompiuteris zaidzia su savim

    Pabaigoj atsapausdinti statistika:

    comp1 laimejo: XXXX
    comp2 laimejo: XXXX
    lygiosios: XXXX

    comp1:
    pasirino akmeni: XX
    pasirinko popieriu: XX
    pasirinko zirkles: XX

    comp2:
    pasirino akmeni: XX
    pasirinko popieriu: XX
    pasirinko zirkles: XX

     */
