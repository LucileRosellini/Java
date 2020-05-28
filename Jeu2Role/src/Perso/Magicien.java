package Perso;

public class Magicien extends Personnage{

    public Magicien(){
      this("");

    }

    public Magicien(String nomJoueur){
        this(nomJoueur,(int)(3+ 3*Math.random()), (int)(8+ 7*Math.random()));

    }

    public Magicien(String nomJoueur,int sante, int puissanceFrappe) {
        super(nomJoueur,sante,puissanceFrappe);
    }
}
//poupée russe