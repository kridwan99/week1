package week7.Interface.ExercisePage20;

public  abstract class FixedAsset implements Valuable {
private  String name; // Name of the asset
private  double marketValue;  // Current market value of the asset


    // Constructor to initialize the name and value
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }
    // Getter for name && market value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    // Abstract method that subclasses must implement to return the value

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }
}
