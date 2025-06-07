package week7.Interface.ExercisePage20;

// House class representing a real estate asset
public class House extends FixedAsset {
    private int yearBuilt;     // Year the house was built
    private int squareFeet;    // Size of the house
    private int bedrooms;      // Number of bedrooms

    // Constructor initializes all fields and passes market value to super
    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    // Getter for year built
    public int getYearBuilt() {
        return yearBuilt;
    }

    // Getter for square feet
    public int getSquareFeet() {
        return squareFeet;
    }

    // Getter for bedrooms
    public int getBedrooms() {
        return bedrooms;
    }

    // Value is based on market value provided
    @Override
    public double getValue() {
        return getMarketValue();
    }
}
