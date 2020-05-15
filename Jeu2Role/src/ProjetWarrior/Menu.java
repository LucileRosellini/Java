package ProjetWarrior;
import personnages.WarriorChar;
import personnages.WizardChar;

import java.util.Scanner;

public class Menu {
    public void msgAccueil (){
        Scanner sc = new Scanner(System.in);
        boolean pasRepondu = true;
        while(pasRepondu) {
            System.out.println("Tu te sent l'âme d'un magicien ou d'un guerrier ?");
            String choice = sc.nextLine();
            if (choice.equals("magicien")) {
                WizardChar NouveauJoueur = new WizardChar();
                System.out.println("Oh? tu es donc un magicien... Comment tu t'appelle déjà? : ");
                String nomDuPersonnage = sc.nextLine();
                NouveauJoueur.setName(nomDuPersonnage);
                System.out.println("Tu t'appelle vraiment " + NouveauJoueur.getName() + " ? ...c'est pas de chance... Bon c'est parti! Essai de rester en vie!");
                pasRepondu = false;
            } else if (choice.equals("guerrier")) {
                WarriorChar NouveauJoueur = new WarriorChar();
                System.out.println("Oh? tu es donc un guerrier... Comment tu t'appelle déjà? : ");
                String nomDuPersonnage = sc.nextLine();
                NouveauJoueur.setName(nomDuPersonnage);
                System.out.println("Tu t'appelle vraiment " + NouveauJoueur.getName() + " ? Alors...c'est pas de chance... Bon c'est parti! Essai de rester en vie.");
                pasRepondu = false;
            } else {
                System.out.println("Me prend pas pour un jambon!");
            }
        }
    }
    }


