package fr.algorithmie;

import com.sun.source.tree.IfTree;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
//       Soit les tableaux suivants :

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
        int[] arraysomme=new int[array2.length+ array1.length]; //le tableau contiendra les 2 tableaux

//      Declaration des variables
        int i=0;    // i sera l'index des tableau parcouru et celui de la boucle egalement'
        int y=0;    // y sera la taille du plus petit tableau et donc la fin du parcour
        int z=0;    // z sera la taille du plus grand tableau
//      Concatainer 2 tables:


        System.out.println();
        System.out.println("Le tableau contatainer:");

//      Ajout du premier tableau
        while   (i<array1.length)       {
            arraysomme[i]=array1[i];

            System.out.print(arraysomme[i]+" ");
            i++;
        }
//      Ajout du deuxieme tableau la valeur de i continu
        while   (i<arraysomme.length)       {
            arraysomme[i]=array2[i-array1.length]; //pour l'indice du deuxieme tableau ,il faut enlever la valeur du premier tableau

            System.out.print(arraysomme[i]+" ");
            i++;
        }


































    }












}
