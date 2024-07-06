import enums.Colour;
import enums.PenType;
import strategies.WriteStrategy;

public abstract class Pen implements WriteStrategy {
    PenType type;
    String brand;
    int price;

    boolean isRefillable;

    WriteStrategy writeStrategy;

    public Pen(PenType type,WriteStrategy writeStrategy){
        this.type = type;
        this.writeStrategy = writeStrategy;
    }

    public void write(){
        writeStrategy.write();
    }

    public abstract Colour getColour();



}
