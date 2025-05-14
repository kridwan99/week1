package week6.ProductShopping;

public class DiscountedProduct extends  Product {
    private double discountPercentage;;

    // Constructor that calls the Product constructor and sets the discount
    public DiscountedProduct(String name, double price, double discountPercentage) {
        super(name, price); // Call the parent Product constructor
        this.discountPercentage = discountPercentage; // Set the discount
    }


    @Override
    public double getFinalPrice() {
        return getPrice() * (1 - discountPercentage / 100);
    }

}
