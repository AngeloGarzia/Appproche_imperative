package fr.tableau;

public class ExerciceTableauChaines {
    public static void main(String[] args) {


        //Declartion du tableau et de ses 5 valeurs chaine
        String[] ville={"Vias","Serignan","Sete","Balaruc","Cap d'agde"};

        //  Affichage des 5 valeurs contenues dans le tableau

        int i=0;
                while (i<ville.length)  {

                    System.out.println(ville[i]);
                    i++;
                                         }

        // Affichage de la longueur du tableau

                    System.out.println("Longeur du tableau:"+ville.length+" Cases");

        //Modification de tableau à l'indice 3 avec la valeur "Reims"

                    ville[3]="Reims";

        //puis affiche les villes avec leur indice du tableau

                i=0;
                while (i<ville.length)  {

                        System.out.println(i+":"+ville[i]);
                        i++;
                                        }












    }






}
