package hello;

public class Masineles {
        public static void main(String[] args) {

 int[] masinytes = new int[8];
 
        int laimetojas = -1;
        int n = 1;
        do {
            int lyderis = 0;
            for (int i = 0; i < masinytes.length; i++) {
                masinytes[i] += (int) (Math.random() * 5) + 1;
                if (masinytes[i] > masinytes[lyderis]) {
                    lyderis = i;
                }
            }
            if (masinytes[lyderis] / 100 >= n) {
                System.out.println(lyderis);
                System.out.println(masinytes[lyderis]);
                System.out.println("----");
                n++;
            }
            for (int i = 0; i < masinytes.length; i++) {
                if (masinytes[i] > 1000) {
                    if (laimetojas < 0 || masinytes[laimetojas] < masinytes[i]) {
                        laimetojas = i;
                    }
                }
            }
        } while (laimetojas == -1);
        System.out.println("pabaiga");
        for (int i = 0; i < masinytes.length; i++) {
            System.out.println(masinytes[i]);
        }
        System.out.println("laimetojas");
        System.out.println(laimetojas);
        System.out.println(masinytes[laimetojas]);
       }
}

/*
        
Masinyciu lenktynes:
        turim 8 masinas

        kieviena masina per karta gali pavaziuoti 1..5 km
        per viena cikla visos masinos pavaziuoja

        lenktynes baigiasi, kai bent viena masina nuvaziuoja 1000 km

        **
        kas 100 km spausdinti pirmaujancios masinos numeri
        **

        pabaigoj atspausdinti laimejusios masinos numeri ir nuvaziuota atstuma

 int[] dalyviai = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < dalyviai.length; i++) {
            for (int km = ((int) (Math.random() * 10) + 2 / 2); km <= 1000; km++) {
                if (km >= 1000) {
                    break;
                }
            System.out.println(km);
        }
        System.out.println("trečios užduoties pabaiga");
}
        */


