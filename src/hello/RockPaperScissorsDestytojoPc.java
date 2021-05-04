package hello;

import java.util.Scanner;

public class RockPaperScissorsDestytojoPc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int pasirinkimas;
        do {
            System.out.println("1. Akmuo");
            System.out.println("2. Popierius");
            System.out.println("3. Zirkles");
            System.out.println("0. Pabaiga");
            pasirinkimas = sc.nextInt();
            if (pasirinkimas < 0 || pasirinkimas > 3) {
                System.out.println("Idiote, ismok naudotis klaviatura !!!");
            } else if (pasirinkimas > 0) {
                int kp = (int) (Math.random() * 3 + 1);
                switch (kp) {
                    case 1:
                        System.out.println("Kompiuterio pasirinkimas: Akmuo");
                        break;
                    case 2:
                        System.out.println("Kompiuterio pasirinkimas: Popierius");
                        break;
                    case 3:
                        System.out.println("Kompiuterio pasirinkimas: Zirkles");
                        break;
                }
                if (pasirinkimas == kp) {
                    System.out.println("Lygiosios");
                } else if (pasirinkimas == 1) {
                    if (kp == 2) {
                        System.out.println("Laimejo kompiuteris");
                    } else {
                        System.out.println("Laimejo zaidejas");
                    }
                } else if (pasirinkimas == 2) {
                    if (kp == 3) {
                        System.out.println("Laimejo kompiuteris");
                    } else {
                        System.out.println("Laimejo zaidejas");
                    }
                } else {
                    if (kp == 1) {
                        System.out.println("Laimejo kompiuteris");
                    } else {
                        System.out.println("Laimejo zaidejas");
                    }
                }
            }
        } while (pasirinkimas != 0);
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
