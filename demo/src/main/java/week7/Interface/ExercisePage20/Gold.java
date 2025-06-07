package week7.Interface.ExercisePage20;

// Gold class representing a gold asset
public class Gold extends FixedAsset {
    private double weight;  // Weight of gold in ounces

    // Constructor uses weight * 60 as estimated market value
    public Gold(String name, double weight) {
        super(name, weight * 60);
        this.weight = weight;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Calculates value as weight * 60 (simplified)
    @Override
    public double getValue() {
        return weight * 60;
    }
}
