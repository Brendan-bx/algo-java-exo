package com.company;

public class compteàrebours {
    static void countdownLoop(int start) {
        for (int i = start; i > 0; i--){
            System.out.println(i + "...");
        }
        System.out.println("FINISHED");
    }
    public static void main(String[] args) {
        countdownLoop(3);


    }
}
