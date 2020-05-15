package ProjetWarrior;
import personnages.InterfaceChar;
import personnages.WarriorChar;
import personnages.WizardChar;

import java.util.Scanner;

public class Menu {
    public void msgAccueil (){
        Scanner sc = new Scanner(System.in);
        boolean pasRepondu = true;
        InterfaceChar newJoueur=null;
        while(pasRepondu) {
            System.out.println("Tu te sent l'âme d'un magicien ou d'un guerrier ?");
            String choice = sc.nextLine();

            if (choice.equals("magicien")) {
                WizardChar joueur = new WizardChar();
                System.out.println("Oh? tu es donc un magicien... Comment tu t'appelle déjà? : ");
                String nomDuPersonnage = sc.nextLine();
                joueur.setName(nomDuPersonnage);
                pasRepondu = false;
                newJoueur =joueur;

            } else if (choice.equals("guerrier")) {
                WarriorChar joueur = new WarriorChar();
                System.out.println("Oh? tu es donc un guerrier... Comment tu t'appelle déjà? : ");
                String nomDuPersonnage = sc.nextLine();
                joueur.setName(nomDuPersonnage);
                pasRepondu = false;
                newJoueur = joueur;

            } else {
                System.out.println("Me prend pas pour un jambon!");
            }
        }
        sc.close();
        System.out.println("Tu t'appelle vraiment " + newJoueur.getName() + " ? Alors ça...c'est pas de chance... Bon c'est parti! Essai de rester en vie.");
        System.out.println("Voici tes specs : "+ newJoueur);
    }
    }


