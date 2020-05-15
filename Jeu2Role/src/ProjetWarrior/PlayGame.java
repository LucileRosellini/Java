package ProjetWarrior;
import personnages.InterfaceChar;

import java.util.Scanner;

public class PlayGame {
    private int valeurDe;

    public int lanceDe() {
        valeurDe=0;
        valeurDe= (int)(1+ 6*Math.random());

        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Tu obtiens un " + valeurDe + " sur ton jet de dés.");
        return valeurDe;
    }
}

