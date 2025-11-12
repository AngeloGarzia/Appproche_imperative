package fr.algorithmie;

import java.util.ArrayList;
import java.util.Scanner;

public class InteractifFibonacci {

    public static void main(String[] args) {
 //     Declaration des variables
        int y=1;
        int nb ;
        int rang;
        int i;
        boolean sortir=false;
        ArrayList<Integer> array =new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
 //     Menu utilisateur

    System.out.println("                   3 : Sortir");

        System.out.println("Entrez le rang de La suite de Fibonacci");
        rang = scanner.nextInt();

        array.add(0);
        array.add(1);
        for (i=2 ;i<rang;i++) {
            array.add(array.get(i-2)+ array.get(i-1));

                                }
        System.out.println("Votre Suite de Fibonacci " + array);












    }

}
