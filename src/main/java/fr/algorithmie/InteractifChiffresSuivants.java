package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb;
        System.out.print("Entrez un nombre :");
        nb = scanner.nextInt();

         int i;
        for ( i=1 ;i<16 ;i++){

            System.out.print(nb+i+" ");

        }
        System.out.print("Bravo!");















    }

}
