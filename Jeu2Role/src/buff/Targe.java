package buff;

public class Targe {

    private  String name ;
    private int buffBonus;

    public Targe() {
        this.name = " targe " ;
        this.buffBonus = 2 ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuffBonus() {
        return buffBonus;
    }

    public void setBuffBonus(int buffBonus) {
        this.buffBonus = buffBonus;
    }

}
