package personnages;
import ProjetWarrior.InterfaceDeplacement;

import java.util.Scanner;

public class WarriorChar extends BonesChar implements InterfaceChar , InterfaceDeplacement {
    private  String name ;
    private String img ;
    private int health;
    private int strikeForce;
    private int stuff;
    private int buff;
    private int position;



    public WarriorChar() {
        this.name = "";
        this.img = "";
        this.health = (int)(5+ 5*Math.random());
        this.strikeForce = (int)(5+ 5*Math.random());
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
        return " Vous êtes une brute connue sous le nom de: " + this.name + " " +
                //" Porte: "+ this.position +
                //" Image du combattant " + this.img +
                " - Point de vie " + this.health +
                " - Force à main nue " + this.strikeForce ;
                //" Stuff " + this.stuff +
                //" Buff " + this.buff;
    }


    //constructeur va mettre des valeurs par defaut ou utiliser les valeurs connues.
    //Methode les actions qu'il va réaliser toString chaine de caractere qui donne tous les infos le concernant.
    //
}



