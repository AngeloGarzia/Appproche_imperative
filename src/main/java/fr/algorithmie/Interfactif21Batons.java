package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
    public static int nombrebaton = 21;
    public static boolean finDuJeu = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tirage = Math.random() * 10;
        if (tirage > 5) {
            System.out.println("Vous avez la première main");
            finDuJeu = joueurjoue(scanner, nombrebaton);
        } else {
            System.out.println("L'ordi prend la première main");
            finDuJeu = ordijoue(scanner, nombrebaton);
        }

        scanner.close();
    }

    public static boolean joueurjoue(Scanner scanner, int nbBatons) {// on utilise le clavier dans cette metode
        if (finDuJeu) return true;  // si le coup d'avance un des deux a gagné on arrete

        System.out.println("Faites votre choix (1-3) :");
        int saisie = saisieValide(scanner, nbBatons); //saisie d'un nombre entre 1 et 3 par joueur
        nbBatons -= saisie; //mise a jour du nombre de batons

        if (nbBatons == 1) { //test si le nombre de baton corespond a la fin du jeux
            System.out.println("Vous avez gagné, il ne reste que " + nbBatons + " baton");
            return true;  // Fin du jeu
        } else {
            System.out.println("Vous retirez " + saisie + " batons, il en reste " + nbBatons);
            return ordijoue(scanner, nbBatons);  // Passage de la main à l’ordi
        }
    }
    //*****************************************************************************************************************
//******************************** Methode ou l'ordi joue**********************************************************
//*********algo simple: si le nombre de baton restant est supeieur a 8 on tire 3 batons****************************
//********* si le nombre de baton est compris entre 5 et 8 on s'arrange pour que le joueur ne puisse pas en laissé*
//********** 1 et gagné ainsi il en restera minimum 2 ,ce qui laisse une main de plus a l'ordi*********************
//********** Si le nb de baton est entre 1 et 5 on acheve le joueur en en laissant qu'un seul et gagner************
//*****************************************************************************************************************
    public static boolean ordijoue(Scanner scanner, int nbBatons) {
        if (finDuJeu) return true;  // si le copup d'avance un des deux a gagné on arrete

        int i = 0;
        if (nbBatons >= 5 && nbBatons < 9) {
            i = nbBatons - (nbBatons - 5);
            if (i > 3) i = 3;
        } else if (nbBatons > 8 && nbBatons < 22) {
            i = 3;
        } else if (nbBatons > 1 && nbBatons < 5) {
            i = nbBatons - 1;
        }
        nbBatons -= i;
        System.out.println("L'ordi retire " + i + " baton, il en reste " + nbBatons);

        if (nbBatons == 1) {
            System.out.println("L'ordi a gagné, vous avez perdu !");
            return true;  // Fin du jeu
        }

        return joueurjoue(scanner, nbBatons);  // Passage au joueur
    }

    //****************************************************************************************************************
    // Methode pour repete la saisie du nombre de batons par le joueur
    // resulat dans saisie apres test de validité de la saisie (entier compris entre 1 et 3)

    public static int saisieValide(Scanner scanner, int nbBatons) {
        int saisie;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Erreur: Veuillez entrer un nombre entier.");
                scanner.next();
                continue;
            }
            saisie = scanner.nextInt();
            if (saisie < 1 || saisie > 3 || nbBatons - saisie < 1) {
                System.out.println("Saisie invalide, réessayez.");
                continue;
            }
            break;
        }
        return saisie;
    }
}