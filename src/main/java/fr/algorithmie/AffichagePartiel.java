package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {








//  Soit le tableau d'entiers suivant
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println();
        System.out.println("Nombre superieurs a 3 du tableau:");
 //     Parcour du tableau et affichage uniquement des nombre >3
                    int i=0;
                    while   (i<array.length)  {

                        if (array[i]>3)     {
                            System.out.print(array[i] + " ");
                                            }
                        i++;
                                              }

//     Parcour du tableau et affichage uniquement des pairs
        System.out.println();
        System.out.println("Nombre paires du tableau:");

        i=0;
        while   (i<array.length)    {

            if  (Math.abs(array[i]) % 2 == 0)   { // attention test sur la valeur absolue pour inclur les nombres negatifs

                System.out.print(array[i] + " ");
            }
            i++;
        }
//     Parcour du tableau et affichage uniquement INDEX des pairs
        System.out.println();
        System.out.println("INDEX des nombre paires du tableau:");

        i=0;
        while   (i<array.length)    {

            if  (Math.abs(array[i]) % 2 == 0)   { // attention test sur la valeur absolue pour inclur les nombres negatifs

                System.out.print(i+" ");
            }
            i++;
        }
//     Parcour du tableau et affichage uniquement des  impairs
        System.out.println();
        System.out.println("Nombre impaires du tableau:");

        i=0;
        while   (i<array.length)    {

            if  (Math.abs(array[i]) % 2 != 0)   { // attention test sur la valeur absolue pour inclur les nombres negatifs

                System.out.print(array[i] + " ");
            }
            i++;
        }




















        }







}
