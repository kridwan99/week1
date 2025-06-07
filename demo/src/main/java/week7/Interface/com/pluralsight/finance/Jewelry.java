package week7.Interface.com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    private double weight;

    public Jewelry(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return marketValue + (weight * 50);
    }
}
