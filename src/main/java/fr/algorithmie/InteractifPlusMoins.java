package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {
        int nb ;
        int i;
        int tampon=0;
        Scanner scanner = new Scanner(System.in);
        for ( i=1 ;i<11 ;i++)                   {

            System.out.print("Entrez le "+i+" nombre :");
            nb = scanner.nextInt();
                if (nb>tampon)  {
                    tampon=nb;
                                }

                                                }

        System.out.print(" Bravo! le plus grand est "+tampon);

















    }

}
