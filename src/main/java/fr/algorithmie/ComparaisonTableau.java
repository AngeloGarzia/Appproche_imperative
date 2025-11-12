package fr.algorithmie;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class ComparaisonTableau {
    public static void main(String[] args) {
//       Soit les tableaux suivants :

        int[] array1 =  {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 =  {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;

//
//      Convertion des entiers du tableau en collection d'objets integer
        Integer[] collectionarray1= Arrays.stream(array1).boxed().toArray(Integer[]::new);
        //array.stream recupere un a un la liste int du tableau array1 puis avec boxed les transforme en objet
        //Integer. Ensuite avec toArray on cree un nouveau tableau d'objet ca sera collectionarray1

        Integer[] collectionarray2= Arrays.stream(array2).boxed().toArray(Integer[]::new);
        //Nous avons desormais 2 tableau d'objet qui vont être manipulables


 //     Hachage des collection sans doublon
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(collectionarray1));
        //nous creons dans set1 une  liste exempt de doublon a partir de collectiopnarray1

        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(collectionarray2));
        //pareil pour collectionarray2

        // Intersection des ensembles
        HashSet<Integer> intersection = new HashSet<>(set1);
        // creation d'une nouvelle collection 'intersection' sans doublon, image de set1

        intersection.retainAll(set2);
        //on met dans intersection les nombres en communs de set2 et lui meme (intersection est modifié
        //mais pas set1


        System.out.println("Nombre d'éléments en communs : " + intersection.size());
        System.out.println("Éléments communs : " + intersection);

































    }












}
