package com.company;

public class Binaire {
    /**
     * Search the value inside the sortes array tab
     *
     * @param tab a sorted array
     * @param num the number to find
     * @return index of the array if found, else -1
     */

    static int searchBinary(int[] tab, int num) {
        int min = 0;
        int max = tab.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            // valeur trouvé à l'indice mid
            if (num == tab[mid]) {
            }
            // num est plus petit que la valeur à l'indice mid ?
            if (num < tab[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
                break;
            }
        }
        return min;


    }
    public static void main(String[] args) {
        int [] scores = {23, 75, 97, 565, 780};
        int index = searchBinary(scores, 23);
        System.out.println("Indes of num= " + index);

    }
}
