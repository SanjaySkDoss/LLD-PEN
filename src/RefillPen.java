public interface RefillPen {
    Refill getRefill();
    boolean isRefillable(Refill refill);
    void changeRefill(Refill refill);
}
