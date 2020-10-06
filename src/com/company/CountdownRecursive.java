package com.company;

public class CountdownRecursive {
    static void Recursive(int start){
        if (start > 0) {
            System.out.println(start + "...");
            Recursive(start -1);
        }
        else {
            System.out.println("FINISHED");
        }
    }
    public static void main(String[] args) {
        Recursive(3);

    }
}
