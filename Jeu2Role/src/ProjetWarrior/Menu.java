package ProjetWarrior;
import personnages.InterfaceChar;
import personnages.WarriorChar;
import personnages.WizardChar;
//import personnages.BonesChar;

import java.util.Scanner;

public class Menu {
    public void msgAccueil (){
        Scanner sc = new Scanner(System.in);
        boolean pasRepondu = true;
        InterfaceChar newJoueur=null;
        System.out.println("Alors comme ça c'est toi qu'on m'envoi? Bon t'es quoi? Un 'guerrier' ou un 'magicien'?");

        while(pasRepondu) {

            String choice = sc.nextLine();

            if (choice.equals("magicien")) {
                WizardChar joueur = new WizardChar();
                System.out.println("Ok. Magicien. Je note!... Comment tu t'appelle déjà? : ");
                String nomDuPersonnage = sc.nextLine();
                joueur.setName(nomDuPersonnage);
                pasRepondu = false;
                newJoueur =joueur;

            } else if (choice.equals("guerrier")) {
                WarriorChar joueur = new WarriorChar();
                System.out.println("Ok. Guerrier. Je note!... Comment tu t'appelle déjà? : ");
                String nomDuPersonnage = sc.nextLine();
                joueur.setName(nomDuPersonnage);
                pasRepondu = false;
                newJoueur = joueur;

            } else {
                System.out.println("Je vais répéter doucement pour que tu puisse comprendre: Es-tu un 'guerrier' ou un 'magicien'?");
            }
        }

        //System.out.println(newJoueur);
        //sc.close();
        System.out.println("Tu t'appelle vraiment " + newJoueur.getName() + " , ça...c'est pas de chance...");
        System.out.println( "  Attends... Je t'inscris pour l'aventure... Alors alors..." + newJoueur + "... Ok c'est noté! Essai de rester en vie - Les morts ne sont pas payés.");

        PlayGame playgame = new PlayGame();
        playgame.jeu(newJoueur);
    }
}


