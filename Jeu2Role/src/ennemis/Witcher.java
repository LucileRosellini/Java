package ennemis;

import ProjetWarrior.InterfaceDeplacement;

public class Witcher extends BonesEnnemis {
    private int health;
    private int strikeForce;


    public Witcher() {
        this.health = 9;
        this.strikeForce = 2;

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


    public String toString() {
        return
                " Santé " + this.health + " strikeforce " + this.strikeForce;
    }
}
