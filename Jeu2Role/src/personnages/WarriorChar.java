package personnages;

public class WarriorChar {
    private  String name ;
    private String img ;
    private int health;
    private int strikeForce;
    private boolean stuff;
    private boolean buff;

    public WarriorChar() {
        this.name = "";
        this.img = "";
        this.health = 0;
        this.strikeForce = 0;
        this.stuff = false;
        this.buff = false;
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

    public boolean isStuff() {
        return stuff;
    }

    public void setStuff(boolean stuff) {
        this.stuff = stuff;
    }

    public boolean isBuff() {
        return buff;
    }

    public void setBuff(boolean buff) {
        this.buff = buff;
    }






    //constructeur va mettre des valeurs par defaut ou utiliser les valeurs connues.
    //Methode les actions qu'il va réaliser toString chaine de caractere qui donne tous les infos le concernant.
    //
}



