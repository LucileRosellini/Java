package Adversaire;

public abstract class Ennemis {

    private int health;
    private int strikeForce;


    public Ennemis(int sante, int puissanceFrappe ) {
        this.health = sante;
        this.strikeForce = puissanceFrappe;

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

}

