package ProjetWarrior;
import ennemis.InterfaceMonster;
import personnages.InterfaceChar;
import java.util.Scanner;
import java.util.Random;

public class PlayGame {
    private int valeurDe;


    public int lanceDe() {
        valeurDe=0;
        valeurDe= (int)(1+ 6*Math.random());


        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Tu avance de " + valeurDe + " pas et tu franchis la prochaine porte!");
        return valeurDe;
    }


    public void initiative(InterfaceChar newJoueur, InterfaceMonster newMonster) {
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
            System.out.println("Pas asser rapide pour esquiver! Tu morfle!");
        }
    }
}
}

