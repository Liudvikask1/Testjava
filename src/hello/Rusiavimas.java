/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author Ever2
 */
public class Rusiavimas {

    public static void main(String[] args) {
    // 2021-04-26 N.D.
    
        int[] masyvas = {123, -1, 5, -7};
 
        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] > masyvas[j]) {
                    int tmp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = tmp;
                }
            }
        }
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
        System.out.println("--------");
        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] < masyvas[j]) {
                    int tmp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = tmp;
                }
            }
        }
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
        
                System.out.println("pirmos užduoties pabaiga");
    }
}


//// 
////        // surusiuoti masyvo elementus didejimo tvarka
////        // {-7, -1, 5, 123}

 /*       int a = 0;      
        for (int i = 0; i < masyvas.length; i++) {
                while (masyvas[0] > masyvas[1]) {
                    a = masyvas[0];
                    masyvas[0] = masyvas[1];
                    masyvas[1] = a; 
                 while (masyvas[1] > masyvas[2]) {
                     a = masyvas[1];
                     masyvas[1] = masyvas[2];
                     masyvas[2] = a;
                 while (masyvas[2] > masyvas[3]) {
                     a = masyvas[2];
                     masyvas[2] = masyvas[3];
                     masyvas[3] = a;
                 }
                 }
                }                                                
                System.out.println(masyvas[i]);  
        }


 // surusiuoti masyvo elementus mazejimo tvarka
// {123, 5, -1, -7}

       for (int i = 0; i < masyvas.length; i++) {
                while (masyvas[0] < masyvas[1]) {
                    a = masyvas[0];
                    masyvas[0] = masyvas[1];
                    masyvas[1] = a; 
                 while (masyvas[1] < masyvas[2]) {
                     a = masyvas[1];
                     masyvas[1] = masyvas[2];
                     masyvas[2] = a;
                 while (masyvas[2] < masyvas[3]) {
                     a = masyvas[2];
                     masyvas[2] = masyvas[3];
                     masyvas[3] = a;
                 }
                 }
                }                                                
                System.out.println(masyvas[i]);  
        }
*/