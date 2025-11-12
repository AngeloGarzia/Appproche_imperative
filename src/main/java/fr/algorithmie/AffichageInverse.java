package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {

//  Soit le tableau suivant;
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

//      Affichage du contenu du tableau
        System.out.println("Dans notre tableau nous avons:");

        int i=0;
                while (i<array.length)      {

                System.out.print(array[i]+" ");
                i++;
                                            }

//      Affichage du contenu du tableau en partant de la fin

        System.out.println();
        System.out.println("Dans notre tableau en  inverse nous avons:");

         i= array.length;
                while (i>0)     {
                System.out.print(array[i-1]+" ");
                i--;
                                }

//      Copie dans arrayCopy du tableau initial array et Affichage du contenu du tableau

        System.out.println();
        System.out.println("Dans notre tableau ArrayCopy nous copions array:");

        int[] arrayCopy= new int[array.length]; //declartion du second tableau de la même taille que celui source

         i=0;
            while (i<array.length)      {

            arrayCopy[i]=array[i]; //copie case a case

            System.out.print(arrayCopy[i]+" "); //affichage de la cas de arryCopy niveau i

            i++;
                                        }





















    }






























}
