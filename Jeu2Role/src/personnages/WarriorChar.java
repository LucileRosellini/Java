package personnages;

public class WarriorChar extends BonesChar implements InterfaceChar {
    private  String name ;
    private String img ;
    private int health;
    private int strikeForce;
    private int stuff;
    private int buff;

    public WarriorChar() {
        this.name = "";
        this.img = "";
        this.health = (int)(5+ 5*Math.random());
        this.strikeForce = (int)(5+ 5*Math.random());
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
        return " Vous êtes une brute connue sous le nom de: " + this.name +
                //" Image du combattant " + this.img +
                " - Point de vie " + this.health +
                " - Force à main nue! : " + this.strikeForce ;
                //" Stuff " + this.stuff +
                //" Buff " + this.buff;
    }



    //constructeur va mettre des valeurs par defaut ou utiliser les valeurs connues.
    //Methode les actions qu'il va réaliser toString chaine de caractere qui donne tous les infos le concernant.
    //
}



