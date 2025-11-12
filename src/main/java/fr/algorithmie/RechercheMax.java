package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
//       Soit le tableau suivant :

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
//      Declaration des variables
        int i=0;
        int leplusgrand=array[0]; //on initialise leplusgrand avec la valeur 1iere du tableau

 //     Parcour de la table à la recheche du plus grand
        System.out.println();
        System.out.println("Le plus grand nombre de la table est:");

        i=0;
        while   (i<array.length)    {

            if (array[i] > leplusgrand) { // si la nouvelle valeur du tableau est > on affecte a leplusgarnd
                leplusgrand = array[i];

            }
            i++;
                                    }
        System.out.print(leplusgrand);


























    }












}
