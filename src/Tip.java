import enums.TipType;

public class Tip {
    TipType type;
    double radius;

    public TipType getType() {
        return type;
    }

    public void setType(TipType type) {
        this.type = type;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
