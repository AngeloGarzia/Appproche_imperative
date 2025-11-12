package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb ;
        System.out.print("Entrez un nombre :");
        nb = scanner.nextInt();

         int i;
         int somme=0;
        for ( i=1 ;i<nb+1 ;i++){

            somme+=i;


        }
        System.out.print(somme+" Bravo!");















    }

}
