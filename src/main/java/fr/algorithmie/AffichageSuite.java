package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
//      Affichage des nombres de 1 à 10 inclus

        for (int i=1; i<11; i++)    {
            System.out.print(i+" ");

                                    }

//      Affichage des nombres paires de 1 à 10 inclus

        System.out.println();
        System.out.println("Les Nombres Paires");

            for (int i=1; i<11; i++)    {

                if (i % 2 == 0) {
                System.out.print(i + " ");

                                }
                                        }

//      Affichage des nombres impaires de 1 à 10 inclus

        System.out.println();
        System.out.println("Les Nombres Impaires");

            for (int i=1; i<10; i++) {

                if (i % 2 != 0) {
                System.out.print(i + " ");

                                }
                                     }
//      Affichage des nombres de 1 à 10 inclus avec while
        System.out.println();
        System.out.println("Les Nombres de 1 à 10 avec While");

        int i=1;
            while (i<11)        {
            System.out.print(i+" ");
            i++;
                                }



//      Affichage des nombres paire de 1 à 10 inclus avec while
        System.out.println();
        System.out.println("Les Nombres paire de 1 à 10 avec While");

            i=1;
                while (i<11) {

                    if (i % 2 == 0)     {
                    System.out.print(i + " ");
                                        }
                    i++;
                            }


        //      Affichage des nombres impaire de 1 à 10 inclus avec while
        System.out.println();
        System.out.println("Les Nombres impaire de 1 à 10 avec While");

        i=1;
        while (i<11) {

            if (i % 2 != 0)     {
                System.out.print(i + " ");
            }
            i++;
        }











    }
}
