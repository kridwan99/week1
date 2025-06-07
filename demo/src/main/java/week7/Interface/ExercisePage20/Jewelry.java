package week7.Interface.ExercisePage20;

public class Jewelry extends FixedAsset {
    private  double karat;

    public Jewelry(String name,  double karat) {
        super(name, karat * 100);

        this.karat = karat;
    }




    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    @Override
    public  double getValue(){
        return  karat * 100;
    }




}
