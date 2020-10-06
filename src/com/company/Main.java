package com.company;

public class Main {
    static void Tableau(int[] scores) {
        for (int i = 0; i < scores.length; i++) { //affichage du tableau
            int score = scores[i];
            System.out.println(score);
        }
    }

    static int Maximum(int[] Max) {
        int max = 0;
        for (int i = 0; i < Max.length; i++) { //valeur maximum du tableau
            if (Max[i] > max) {
                max = Max[i];
            }
        }

        return max;
    }
        static boolean Moinsde10 (int [] oui) {
            boolean moinsde10 = false; // Si le tableau possède une valeur inférieur à 10 ou non
            for (int i = 0; i < oui.length; i++) {
            if (oui[i] < 10) {
                moinsde10 = true;
        }
    }
            return moinsde10;
}

    public static void main(String[] args) {
        int [] scores = new int [7]; //déclaration de tableau de taille 7
        scores [0] = 25;
        scores [1] = 90;
        scores [2] = 78;
        scores [3] = 69;
        scores [4] = 12;
        scores [5] = 99;
        scores [6] = 56;

        // i va varier de 0 à taille -1

        float score2 = 0;
        for (int i = 0; i < scores.length; i++) {
            score2 = score2 + scores[i];
        } //calcul de la moyenne
        score2 = score2 / scores.length;

        System.out.println("la moyenne: "+ score2);


        Tableau(scores);
        System.out.println("max = " +Maximum(scores));
        System.out.println(Moinsde10(scores));


    }
}
