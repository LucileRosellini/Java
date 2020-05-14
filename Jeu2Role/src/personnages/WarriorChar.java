package personnages;

public class WarriorChar extends BonesChar {
    public WarriorChar() {
        this.name = "";
        this.img = "";
        this.health = 0;
        this.strikeForce = 0;
        this.stuff = false;
        this.buff = false;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return(this.name);
    }

}



