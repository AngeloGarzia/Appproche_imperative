package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
//       Soit le tableau suivant :

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
//      Declaration des variables
        int i=0;
        int tampon; // servira de tampon avant de deplacement



//      affichage de la table d'aorigine

            while (i< array.length)     {
            System.out.print(array[i]+" ");
            i++;
                                       }
            System.out.println();

 //     copie du dernier element en memoire tampon
        tampon=array[array.length-1];

        i=0; //compteur a zero

        while   (i<array.length-1)    {
                array[array.length-1]=array[i]; //decalage a droite des element de la table
            i++;
                                    }


 //     NE PAS OUBLIER DE COPIER LE PREMIER ELEMENT
        i=0;
        array[0]=tampon;
        while (i< array.length)     {
            System.out.print(array[i]+" ");
            i++;
                                    }

























    }












}
