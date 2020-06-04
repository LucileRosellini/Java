package ProjetWarrior;

import Perso.Personnage;
import java.util.Scanner;


public class Deplacement {

    public int lanceDe() {
        int valeurDe = (int) (1 + 6 * Math.random());
        return valeurDe;
    }


    public void jeu(Personnage player) {
        int position = player.getPosition();
        Scanner sc = new Scanner(System.in);
        boolean pasRepondu = true;
        int valeurDe;
        Plateau plateau = new Plateau();

        while (pasRepondu && position <= 64) {
            System.out.println(" (-Press ↵ pour continuer-) ");
            String choice = sc.nextLine();
            IEvent caseCourante = plateau.getCase(player.getPosition());
            if (choice.equals("")) {
                valeurDe = lanceDe();
                position = position + valeurDe;
                if (position >= 64) {
                   // ---------------------
                    //Version avec empechement de depassement numerique.
                    position = position - (position - 64);
                    System.out.println("Vous trouvez la fameuse porte " + position + " et trouvez ce fichu sceptre à la noix! Rapportez le à vôtre commanditaire pour être payé.  ");
                    break;
                    //----------------------
                    //Version avec ajout de case EmptyCase si depassement de plateau.
                    //plateau.addEmptyCase();
                    //-----------------------
                    //Version avec exeption si depassement de plateau ... en cours ecriture.
                }
                System.out.println("Vous avancez de " + valeurDe + " pas et franchissez la porte " + position);
                player.setPosition(position);
                caseCourante.interaction(player);
                //System.out.println(player);
            } else{
                System.out.println(" (-Press ↵ pour continuer-) ");

            }
        }

    }
}

