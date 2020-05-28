package ProjetWarrior;

import Perso.Magicien;
import Perso.Guerrier;
import Perso.Personnage;

import java.util.Scanner;

public class Menu {
    public void msgAccueil (){
        Scanner sc = new Scanner(System.in);
        boolean pasRepondu = true;
        Personnage newJoueur = null;
        System.out.println("Alors comme ça c'est toi qu'on m'envoi? Bon t'es quoi? Un 'guerrier' ou un 'magicien'?");

        while(pasRepondu) {

            String choice = sc.nextLine();

            if (choice.equals("magicien")) {
                newJoueur = new Magicien();
                System.out.println("Ok. Magicien. Je note!... Comment tu t'appelle déjà? : ");
                String nomDuPersonnage = sc.nextLine();
                newJoueur.setName(nomDuPersonnage);
                pasRepondu = false;

            } else if (choice.equals("guerrier")) {
                newJoueur = new Guerrier();
                System.out.println("Ok. Guerrier. Je note!... Comment tu t'appelle déjà? : ");
                String nomDuPersonnage = sc.nextLine();
                newJoueur.setName(nomDuPersonnage);
                pasRepondu = false;

            } else {
                System.out.println("Je vais répéter doucement pour que tu puisse comprendre: Es-tu un 'guerrier' ou un 'magicien'?");
            }
        }

        //System.out.println(newJoueur);
        //sc.close();
        System.out.println("Tu t'appelle vraiment " + newJoueur.getName() + " , ça...c'est pas de chance...");
        System.out.println( "  Attends... Je t'inscris pour l'aventure... Alors alors..." + newJoueur + "... Ok c'est noté! Essai de rester en vie - Les morts ne sont pas payés.");

        Deplacement playgame = new Deplacement();
        playgame.jeu(newJoueur);
    }
}


