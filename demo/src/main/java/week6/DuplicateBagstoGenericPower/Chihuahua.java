package week6.DuplicateBagstoGenericPower;

public class Chihuahua {

    private  String name;
    public Chihuahua(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public  String toString(){
        return "Chihuahua:" + name;
    }

}
