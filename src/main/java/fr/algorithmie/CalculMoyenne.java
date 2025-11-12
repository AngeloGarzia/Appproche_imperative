package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
//       Soit le tableau suivant :

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
//      Declaration des variables
        int i=0;
        float moyenne=0f; //on initialise à 0

 //     Parcour de la table et on calcule la moyene
        System.out.println();
        System.out.println("La moyenne est de la table est:");

        i=0;
        while   (i<array.length)    {
            moyenne=moyenne+array[i];
            i++;
                                    }
        moyenne=moyenne/ array.length;
        System.out.print(moyenne);


























    }












}
