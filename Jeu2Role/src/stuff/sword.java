package stuff;

public class sword{
    private  String name ;
    private int stuffBonus;

    public sword() {
    this.name = " épée " ;
    this.stuffBonus = 5 ;
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