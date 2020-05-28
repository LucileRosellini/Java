package Perso;

public class Guerrier extends Personnage{

    public Guerrier(){
        this("");

    }

    public Guerrier(String nomJoueur){
        this(nomJoueur,(int)(5+ 5*Math.random()),(int)(5+ 5*Math.random()));

    }

    public Guerrier(String nomJoueur,int sante, int puissanceFrappe) {
        super(nomJoueur,sante,puissanceFrappe);
    }
}

//poupée russe
