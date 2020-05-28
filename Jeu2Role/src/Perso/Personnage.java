package Perso;

public abstract class Personnage {
    private  String name ;
    private int health;
    private int strikeForce;
    private int stuff;
    private int buff;
    private int position;


    public Personnage (String nomJoueur, int sante , int puissanceFrappe ) {
        this.name = nomJoueur;
        this.health = sante;
        this.strikeForce = puissanceFrappe;
    }

    //public Personnage (String nomJoueur) {
    //   this.name = nomJoueur; }

    public String getName() {
        return(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrikeForce() {
        return strikeForce;
    }

    public void setStrikeForce(int strikeForce) {
        this.strikeForce = strikeForce;
    }

    public int getStuff() {
        return stuff;
    }

    public void setStuff(int stuff) {
        this.stuff = stuff;
    }

    public int getBuff() {
        return buff;
    }

    public void setBuff(int buff) {
        this.buff = buff;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


    public String toString() {
        return " Nom du combattant " + this.name +
                " Santé " + this.health +
                " strikeforce " + this.strikeForce +
                " Stuff " + this.stuff +
                " Buff " + this.buff;
    }

}
