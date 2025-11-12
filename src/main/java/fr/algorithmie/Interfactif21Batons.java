package fr.algorithmie;

public class Interfactif21Batons {
    public static int nombrebaton =21;

    public static void main(String[] args) {


// Tirage au sort du premier joueur
     int baton=21;

       double tirage =Math.abs(Math.random())*10;
       if (tirage>5)   {
           joueurjoue(nombrebaton);     // joueur commence
                        }

       else             {
           ordijoue(nombrebaton);
       }






    } //fin de main
    public static int joueurjoue(int nombrebaton) {

        return ;
    }

    public static boolean ordijoue(int nombrebaton) {
            if (nombrebaton>5)  {
                nombrebaton=nombrebaton-(5+nombrebaton);

                joueurjoue(nombrebaton);
                return true;
                                 }
            else                {

                return false;
                                }
                                                    }

}//fin de l'exercice
