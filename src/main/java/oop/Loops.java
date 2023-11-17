package oop;

public class Loops {
    int liczba = 1;


    static int[] liczby;

    //psvm
    public static void main(String[] args) {
        liczby = new int[3];
        liczby[0] = 1;
        liczby[1] = 20;
        liczby[2] = 39;


        //for(int number: liczby){
        //System.out.println("Liczba: "+ number);

        // }

        // for(int i = 0; i<3 ; i++){
        //  System.out.println("Liczba: "+ liczby[i]);

        // }
        //for (int i = 0; i<10 ; i++){
        //System.out.println("liczymy:" + i);
        // }
        for (int i = 2; ; i = i * 2) {
            System.out.println(i);
            if (i == 0) {
                System.out.println("no to kończymy");
                break;
            }

            // int i =1;
            // while (i<10){
            // System.out.println(i++);
            // if(i == 5) System.out.println("połowa już");
            // }


        }


    }
}