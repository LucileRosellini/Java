package ennemis;

public class Dragon extends BonesEnnemis {
    private int health;
    private int strikeForce;


    public Dragon() {
        this.health = 15;
        this.strikeForce = 4;
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
