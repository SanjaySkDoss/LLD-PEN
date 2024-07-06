import enums.Colour;
import enums.PenType;
import strategies.SmoothWritingStrategy;
import strategies.WriteStrategy;

public class BallPen extends Pen implements RefillPen{

    Refill refill;

    private BallPen(WriteStrategy writeStrategy){
        super(PenType.BALL,writeStrategy);
    }

    @Override
    public Colour getColour() {
        return this.refill.getInk().getColour();
    }

    @Override
    public Refill getRefill() {
        return this.refill;
    }
    @Override
    public boolean isRefillable(Refill refill) {
        return refill.getType() == this.refill.getType();
    }

    @Override
    public void changeRefill(Refill refill) {
        if(isRefillable(refill))
            this.refill = refill;
    }

    public static class Builder{

        PenType type;
        String brand;
        int price;

        boolean isRefillable;

        public Builder setWriteStrategy(WriteStrategy writeStrategy) {
            this.writeStrategy = writeStrategy;
            return this;
        }

        WriteStrategy writeStrategy;
        BallPen build(){
            if(writeStrategy == null)
                throw new RuntimeException("Write Strategy is null");
            BallPen ballPen = new BallPen(this.writeStrategy);
            ballPen.brand = this.brand;
            ballPen.price = this.price;
            ballPen.isRefillable = this.isRefillable;
            return ballPen;
        }




        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setRefillable(boolean refillable) {
            isRefillable = refillable;
            return this;
        }
    }
}
