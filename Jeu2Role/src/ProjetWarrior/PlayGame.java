package ProjetWarrior;
import personnages.BonesChar;
import personnages.InterfaceChar;
import ennemis.BonesEnnemis;
import java.util.Scanner;
import java.util.Random;

public class PlayGame {

    public int lanceDe() {
        int valeurDe = (int) (1 + 6 * Math.random());

        //Scanner sc = new Scanner(System.in);  // Create a Scanner object

        return valeurDe;
    }


    public void jeu(InterfaceChar player) {
        int position = player.getPosition();
        Scanner sc = new Scanner(System.in);
        boolean pasRepondu = true;
        int valeurDe;

        //System.out.println("Tu avances de " + valeurDe + " pas et tu franchis la prochaine porte!");
        //return valeurDe;


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





    public void initiative(InterfaceChar newJoueur, BonesEnnemis newMonster) {
       Random rd = new Random(); // creating Random object;
        boolean pileOuFace = rd.nextBoolean();
        System.out.println(pileOuFace); // displaying a random boolean

        while (newJoueur.getHealth() <= 0 || newMonster.getHealth() <= 0 ){

        if (pileOuFace = true) {
            int playerHurt = newJoueur.getStrikeForce() + newJoueur.getStuff();
            newMonster.setHealth(newMonster.getHealth() - playerHurt);

            Scanner sc = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Distribution de baffes! Et BAM! Dans ses dents!");
        } else {
            int monsterHurt = newMonster.getStrikeForce();
            newMonster.setHealth(newJoueur.getHealth() - monsterHurt);

            Scanner sc = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Pas assez rapide pour esquiver! Tu morfles!");
        }
    }
}
}

