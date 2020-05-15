package personnages;

public class WarriorChar extends BonesChar implements InterfaceChar{
    private  String name ;
    private String img ;
    private int health;
    private int strikeForce;
    private int stuff;
    private int buff;

    public WarriorChar() {
        this.name = "";
        this.img = "";
        this.health = 0;
        this.strikeForce = 0;
        this.stuff = 0;
        this.buff = 0;
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


    public String toString() {
        return " Nom du combattant " + this.name +
                " Image du combattant " + this.img +
                " Santé " + this.health +
                " strikeforce " + this.strikeForce +
                " Stuff " + this.stuff +
                " Buff " + this.buff;
    }



    //constructeur va mettre des valeurs par defaut ou utiliser les valeurs connues.
    //Methode les actions qu'il va réaliser toString chaine de caractere qui donne tous les infos le concernant.
    //
}



