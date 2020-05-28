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

        while (pasRepondu && position <= 64) {
            System.out.println(" (-Press ↵ pour continuer-) ");
            String choice = sc.nextLine();

            if (choice.equals("")) {
                valeurDe = lanceDe();
                position = position + valeurDe;
                if (position >= 64) {
                    position = position - (position - 64);
                    System.out.println("Tu trouve la fameuse porte " + position + " et trouve le sceptre d'eau! ");
                    break;
                }
                System.out.println("Tu avance de " + valeurDe + " pas et tu franchis la porte " + position);
                player.setPosition(position);
                //System.out.println(player);
            } else{
                System.out.println(" (-Press ↵ pour continuer-) ");

            }
        }

    }
}

