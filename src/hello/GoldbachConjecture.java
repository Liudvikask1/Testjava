package hello;

/*
Bet koks LYGINIS skaicius gali buti uzrasytas
    dvieju PIRMINIU skaiciu suma

4 = 2 + 2
6 = 3 + 3
8 = 3 + 5
10 = 5 + 5
12 = 5 + 7

    1 nera pirminis
    atspausdinti visu (lyginiu) skaiciu sudetines dalis
    uztenka vieno varianto
    intervale nuo 4..2000
 */
public class GoldbachConjecture {

    public static void main(String[] args) {
        for (int i = 4; i < 2000; i++) {
            if (i % 2 == 0) {
                for (int j = 2; j < 10; j++) {
                    for (int z = 1; z < j; z++)
                        if (z == j || z == 1)
                    System.out.println(j);
                }
            }
        }
    }
}

/*
public static void main(String[] args) {


int pirminis1 = 0;
int pirminis2 = 0;
int lyginis = 0;
int pirminiuSuma = 0;
int max = 100;

for (int i = 2; i <= max; i++) {
// tikrina ar lyginiai skaiciai, jei taip issaugo kaip i kintamaji -> lyginiai
if (i % 2 == 0) {
lyginis = i;
}
for (int m = 2; m < max; m++) {
// tikrina ar skaiciai yra pirminiai, jei taip issaugo i kintamaji -> pirminis1
if (isPrime(m) == true) {
pirminis1 = m;
}
for (int k = 2; k < max; k++) { // toks pat foras kaip pries tai vel tikrinu ar pirminis skaicius
if (isPrime(k) == true) {
pirminis2 = k;
}
if (pirminiuSuma == lyginis) { // cia patikrina ar tokia pora jau yra?
break;
}
if (pirminis1 + pirminis2 == lyginis) { // cia skaiciuoju ar dvieju pirminiu suma yra = lyginiam skaiciui
pirminiuSuma = lyginis;

System.out.println(lyginis + " = " + pirminis1 + " + " + pirminis2);
}
}
}
}
}

static boolean isPrime(int n) {
for (int i = 2; i < n; i++) {
if (n % i == 0) {
return false;
}
}
return true;
}
*/

/*
Naglio sprendimas:

package sample;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        int number = 6;
        for( int i = 4; i <2000; i+=2){
            int[] result = getPrimeNumbers(i);
            int[] arr = cleanArr(result);
            printResult(arr,i);
        }
    }

    public static void printResult(int[] arr, int number){
            for( int i = 0; i <arr.length; i++){
                for( int a = i; a <arr.length; a++) {
                    if(arr[i]+arr[a]== number) {
                        System.out.println(arr[i] + " + " + arr[a] + " = " + number);
                        return;
                    }
                }
            }
    }

    public static int howManyNumbersNotZeros (int[] result) {
        int count = 0;
        for( int i = 0; i <result.length; i++) {
            if (result[i] != 0) {
                count++;
            }
        }
        return count;
    }
    public static int[] cleanArr (int[] result){
       int count = howManyNumbersNotZeros((result));
        int[] arr = new int[count];
        int count2 = 0;
        for( int i = 0; i <result.length; i++) {
            if (result[i] != 0) {
                arr[count2] = result[i];
                count2++;
            }
        }
    return arr;
    }
    public static int[] getPrimeNumbers(int number)
    {
        int[] primeNumbers = new int[number];
        for (int i = 2; i <= number; i++)
        {
            if(isPrime(i))
            {
                primeNumbers[i] = i;
            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n % i==0)
                return false;
        }
        return true;
    }
}
*/