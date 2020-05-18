package ennemis;

public class Gobelins extends BonesEnnemis implements InterfaceMonster {
        private int health;
        private int strikeForce;


        public Gobelins() {
            this.health = 6;
            this.strikeForce = 1;
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
                    " Santé " + this.health +
                    " strikeforce " + this.strikeForce;
        }

    }
