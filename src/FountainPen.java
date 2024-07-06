import enums.Colour;
import enums.PenType;
import strategies.WriteStrategy;

public class FountainPen extends Pen{

    Ink ink;

    public FountainPen(WriteStrategy writeStrategy){
        super(PenType.FOUNTAIN,writeStrategy);
    }

    @Override
    public Colour getColour() {
        return this.ink.colour;
    }
}
