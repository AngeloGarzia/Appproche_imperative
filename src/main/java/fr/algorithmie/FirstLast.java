package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {

//       Soit le tableau suivant :

        int[] array1 = {9, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 9};
        boolean vide;   //declaration du booleen viede

//      VERSION TERNAIRE
        vide=(array1.length > 0 && (array1[0]== array1[array1.length-1])) ? true : false;
        System.out.println("les condition sont verifiées :"+vide);

//      Version classique

        if (array1.length > 0 && (array1[0]== array1[array1.length-1]))  {
            vide = true;
                                                                                }
        else    {
                vide=false;

                }
        System.out.println("les condition sont verifiées :"+vide);
























    }
}
