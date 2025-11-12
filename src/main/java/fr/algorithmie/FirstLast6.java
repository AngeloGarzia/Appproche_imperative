package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {

//       Soit le tableau suivant :

        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 9};
        boolean vide;   //declaration du booleen vide

//      VERSION TERNAIRE
        vide=(array1.length > 0 && (array1[0]==6 || array1[array1.length-1]==6)) ? true : false;
        System.out.println("les condition sont verifiées :"+vide);


//      VERSION CLASSIQUE
        if (array1.length > 0 && (array1[0]==6 || array1[array1.length-1]==6))  {
            vide = true;
                                                                                }
        else    {
                vide=false;

                }
        System.out.println("les condition sont verifiées :"+vide);
























    }
}
