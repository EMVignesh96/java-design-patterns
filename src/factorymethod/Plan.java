package factorymethod;

public class Plan {
    private float rate;
    Plan(int rate) { this.rate = rate; }
    public float getRate() { return rate; }
    float getAmount(int units) { return rate * units; }
}
