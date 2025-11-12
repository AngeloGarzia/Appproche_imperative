package fr.algorithmie;
import java.util.Scanner; //il faut importer la class scanner

public class InteractifTantQue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb;

         do {
             System.out.print("Entrez un nombre entre 1 et 10 : ");
             nb = scanner.nextInt();
         }
        while (nb>10 || nb<1);
        System.out.print("Bravo!");















    }

}
