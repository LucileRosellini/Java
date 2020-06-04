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
        System.out.println("Alors comme ça c'est toi qu'on m'envoi?... Tu m'as pas l'air trés costaud. Bon, remplissons le formulaire? Es-tu un 'guerrier' ou un 'magicien'?");

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
                System.out.println("Notre demande était pourtant explicite! On a demandé un 'guerrier' ou un 'magicien'?! Alors? Sois tu es l'un ou l'autre... Soit tu t'en vas!");
            }
        }

        //System.out.println(newJoueur);
        //sc.close();
        System.out.println("Tu t'appelle vraiment " + newJoueur.getName() + " , ça...c'est pas de chance...");
        System.out.println("Bon... Ta mission est simple - Tu rentre dans le donjon - Tu trouve la porte 64. Et tu nous rapporte le sceptre que tu y trouveras.");
        System.out.println("Tu vas peut-être rencontrer quelques bestioles - Tu t'en fais pas, tu bute... Bon!");
        System.out.println( "Voici ton contrat..." + newJoueur + "... Oh! Et signe cette décharge aussi ... La corporation ne serait être tenu responsable de ton eventuelle incompétence funeste... ");
        System.out.println("... Voilà. Tout est en ordre! Tu peux entrer dans le donjon, Oh! Et  essai de rester en vie, hein? - Les morts ne sont pas payés.");
        Deplacement playgame = new Deplacement();
        playgame.jeu(newJoueur);
    }
}


