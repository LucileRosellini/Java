package Adversaire;


import Perso.Personnage;
import ProjetWarrior.IEvent;

public abstract class Ennemis implements IEvent {

    private int health;
    private int strikeForce;

    private String name;

    public Ennemis(int sante, int puissanceFrappe, String nom ) {
        this.health = sante;
        this.strikeForce = puissanceFrappe;
        this.name = nom;

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

    public String getName() {
        return name;
    }

    @Override
    public void interaction(Personnage player) {
        System.out.println("Vous tombez nez à nez avec un " + this.getName() + "! Oh non! Il vous a vu!");

    }
}

