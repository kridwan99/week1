package week6.AmusementParkPasses;

public class SeniorPass extends  Pass{
    public SeniorPass(String holderName, double basePrice){
        super(holderName, basePrice);
    }
    @Override
    public double calculateFinalPrice(){
        return getBasePrice() * 0.7;
    }
}
