package Exercice01;

import java.util.Scanner;

public class TAB {
    public static int Nmax = 40;

    public static void remplir(float[] t) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            System.out.print("t[" + i + "] = ");
            t[i] = sc.nextFloat();
        }
        
    }

    public static float somme_element(float[] t) {
        float resultat = 0;
        for (float val : t) {
            resultat += val;
        }
        return resultat;
    }

    public static float[] additionner(float[] t1, float[] t2) {
        float[] resultat = new float[t1.length];
        for (int i = 0; i < t1.length; i++) {
            resultat[i] = t1[i] + t2[i];
        }
        return resultat;
    }

    public static float[] produit(float x, float[] t) {
        float[] resultat = new float[t.length];
        for (int i = 0; i < t.length; i++) {
            resultat[i] = t[i] * x;
        }
        return resultat;
    }

    public static void lire(float[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println("t[" + i + "] = " + t[i]);
        }
    }

    public static float[] additionner(float x, float[] t) {
        float[] resultat = new float[t.length];
        for (int i = 0; i < t.length; i++) {
            resultat[i] = t[i] + x;
        }
        return resultat;
    }
}
