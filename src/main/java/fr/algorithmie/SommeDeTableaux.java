package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
//       Soit les tableaux suivants :

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
        int[] araysomme=new int[17];

//      Declaration des variables
        int i=0;

 //     Parcour des tables et on met la somme case a case dans arrysomme
        System.out.println();
        System.out.println("Le tableau somme:");


        while   (i<array1.length)       {
            araysomme[i]=array1[i]+array2[i];

            System.out.print(araysomme[i]+" ");
            i++;
                                        }




























    }












}
