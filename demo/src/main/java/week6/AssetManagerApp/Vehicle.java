package week6.AssetManagerApp;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    // Constructor
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    // Getters and setters
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    // Override getValue() to calculate vehicle value
    @Override
    public double getValue() {
        int currentYear = 2025; // Assuming the current year is 2025
        int age = currentYear - year;
        double depreciationRate = 0.03; // 3% depreciation per year
        double value = getOriginalCost() * Math.pow((1 - depreciationRate), age);

        // Reduce value by 25% if over 100,000 miles, unless make/model contains "Honda" or "Toyota"
        if (odometer > 100000 && !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            value *= 0.75;
        }

        // Apply additional depreciation based on age
        if (age >= 0 && age <= 3) {
            value *= 0.97; // 3% reduced value per year
        } else if (age >= 4 && age <= 6) {
            value *= 0.94; // 6% reduced value per year
        } else if (age >= 7 && age <= 10) {
            value *= 0.92; // 8% reduced value per year
        } else if (age > 10) {
            value = 1000.0; // $1000.00 for vehicles over 10 years old
        }

        return value;
    }
}
