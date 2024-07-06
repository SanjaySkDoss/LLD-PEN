import enums.Colour;
import enums.PenType;
import strategies.SmoothWritingStrategy;
import strategies.WriteStrategy;

public class GelPen extends Pen implements RefillPen{

    Refill refill;

    public GelPen(WriteStrategy writeStrategy){
        super(PenType.GEL,writeStrategy);
    }

    @Override
    public Colour getColour() {
        return refill.getInk().getColour();
    }

    @Override
    public Refill getRefill() {
        return this.refill;
    }

    @Override
    public void changeRefill(Refill refill) {
        if(isRefillable(refill))
            this.refill = refill;
    }

    @Override
    public boolean isRefillable(Refill refill) {
        return refill.getType() == this.refill.getType();
    }
}
