package week7.Interface.com.pluralsight.finance;

import week7.Interface.com.pluralsight.Valuable;

public abstract class FixedAsset implements Valuable {
    public String name;
   public double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public double getValue() {
        return marketValue;
    }
}
