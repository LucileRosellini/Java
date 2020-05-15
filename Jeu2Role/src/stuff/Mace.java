package stuff;

public class Mace{

    private  String name ;
    private int stuffBonus;

    public Mace() {
        this.name = " massue " ;
        this.stuffBonus = 3 ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuffBonus() {
        return stuffBonus;
    }

    public void setStuffBonus(int stuffBonus) {
        this.stuffBonus = stuffBonus;
    }

}