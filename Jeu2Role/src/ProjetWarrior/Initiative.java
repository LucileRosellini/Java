package ProjetWarrior;

import Adversaire.Ennemis;
import Perso.Personnage;

import java.util.Random;
import java.util.Scanner;

public class Initiative {

    public  Initiative(Personnage newJoueur, Ennemis newMonster) {
        Random rd = new Random(); // creating Random object;
        boolean pileOuFace = rd.nextBoolean();
        System.out.println(pileOuFace);

        while (newJoueur.getHealth() <= 0 || newMonster.getHealth() <= 0 ){

            if (pileOuFace = true) {
                int playerHurt = newJoueur.getStrikeForce() + newJoueur.getStuff();
                newMonster.setHealth(newMonster.getHealth() - playerHurt);

                Scanner sc = new Scanner(System.in);
                System.out.println("Distribution de baffes! Et BAM! Dans sa mouille!");
            } else {
                int monsterHurt = newMonster.getStrikeForce();
                newMonster.setHealth(newJoueur.getHealth() - monsterHurt);

                Scanner sc = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Pas assez rapide pour esquiver! Tu te prends une rouste!");
            }
        }
    }
}
