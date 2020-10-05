package com.company;

public class Main {

    public static void main(String[] args) {
        int [] scores = new int [7]; //déclaration de tableau de taille 7
        scores [0] = 25;
        scores [1] = 8;
        scores [2] = 78;
        scores [3] = 5;
        scores [4] = 12;
        scores [5] = 99;
        scores [6] = 56;
        // i va varier de 0 à taille -1
        for (int i =0;i<scores.length;i++){
            int score = scores[i];
            System.out.println(score);
        }
        float score2 = 0;
        for (int i = 0; i < scores.length; i++) {
            score2 = score2 + scores[i];
        }
        score2 = score2 / scores.length;

        System.out.println("la moyenne: "+ score2);


    }
}
