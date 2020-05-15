package ennemis;

public class BonesEnnemis {

    private int health;


    private int strikeForce;


    public BonesEnnemis() {
        this.health = 0;
        this.strikeForce = 0;
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
