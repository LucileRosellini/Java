package personnages;

import ProjetWarrior.InterfaceDeplacement;

public class WizardChar extends BonesChar implements InterfaceChar, InterfaceDeplacement {
    private  String name ;
    private String img ;
    private int health;
    private int strikeForce;
    private int stuff;
    private int buff;
    private int position;

    public WizardChar()
    {
        this.name = "" ;
        this.img = "";
        this.health = (int)(3+3*Math.random());
        this.strikeForce = (int)(8+7*Math.random());
        this.stuff = 0;
        this.buff = 0;
        this.position = 0;
    }

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getStrikeForce() {
        return strikeForce;
    }

    public void setStrikeForce(int strikeForce) {
        this.strikeForce = strikeForce;
    }

    public int isStuff() {
        return stuff;
    }

    public void setStuff(int stuff) {
        this.stuff = stuff;
    }

    public int isBuff() {
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
        return " Vous êtes une vieille branche plus connu sous le nom de: " + this.name +
                //" Image du combattant " + this.img +
                //" Porte: "+ this.position +
                " - Point de vie " + this.health +
                " - Dégats critiques : " + this.strikeForce ;
                //" Stuff " + this.stuff +
                //" Buff " + this.buff;
    }

}

