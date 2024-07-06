import enums.RefillType;
import strategies.WriteStrategy;

public class Refill {
    RefillType type;
    Ink ink;
    Tip tip;



    Refill(RefillType type){
        this.type = type;

    }


    public RefillType getType() {
        return type;
    }

    public void setType(RefillType type) {
        this.type = type;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }
}
