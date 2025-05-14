package week6.AmusementParkPasses;

public class ChildPass extends Pass {
    public  ChildPass(String holderName, double basePrice) {
        super(holderName, basePrice);
    }
    @Override
    public  double calculateFinalPrice() {
        return  getBasePrice() * 0.5;
    }
}
