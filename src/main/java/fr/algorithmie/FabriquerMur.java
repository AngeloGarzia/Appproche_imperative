package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args)  {
//  Declaration des variables

        FabriquerMur.fabriquerMur(3, 1, 8);
        FabriquerMur.fabriquerMur(3, 1, 9);
        FabriquerMur.fabriquerMur(3, 2, 10);
        FabriquerMur.fabriquerMur(3, 2, 8);
        FabriquerMur.fabriquerMur(3, 2, 9);
        FabriquerMur.fabriquerMur(6, 1, 11);
        FabriquerMur.fabriquerMur(6, 0, 11);
        FabriquerMur.fabriquerMur(1, 4, 11);
        FabriquerMur.fabriquerMur(0, 3, 10);
        FabriquerMur.fabriquerMur(1, 4, 12);
        FabriquerMur.fabriquerMur(3, 1, 7);
        FabriquerMur.fabriquerMur(1, 1, 7);

                                            }


        public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur)   {
            //
                    if (nbBig*5+nbSmall>=longueur) {

                        System.out.println(nbBig+" grands +  "+nbSmall+" petits "+" C'est possible de faire "+longueur);
                        return true;

                    }
                    else                            {
                        System.out.println(nbBig+" grands +  "+nbSmall+" petits "+" C'est imppossible de faire "+longueur);
                        return false;
                                                    }
                                                                            }























    }

