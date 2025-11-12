package fr.algorithmie;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class InteractifStockageNombre {

    public static void main(String[] args) {
 //     Declaration des variables
        int y=1;
        int nb ;
        int i;
        boolean sortir=false;
        ArrayList<Integer> array =new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
 //     Menu utilisateur
do {

    System.out.println("Entrez votre choix 1 : Ajouter un nombre");
    System.out.println("                   2 : Affiche le tableau");
    System.out.println("                   3 : Sortir");
    nb = scanner.nextInt();
    if (nb == 1) {
        System.out.println("Entrez un nombre a ajouter au tableau");
        nb = scanner.nextInt();
        array.add(nb);
        System.out.println("Votre tableau " + array);

    }
    if (nb == 2) {
        System.out.println("Votre tableau " + array);
                }

    if (nb==3)      {
        sortir=true;
                    }
    } while (sortir==false);















    }

}
