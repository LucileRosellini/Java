package ProjetWarrior;


import personnages.WarriorChar;
import personnages.WizardChar;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.msgAccueil();
        PlayGame playgame= new PlayGame();
        playgame.lanceDe();
    }

}




