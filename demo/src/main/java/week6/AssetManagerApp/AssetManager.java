package week6.AssetManagerApp;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("My House", "2020-05-01", 300000, "123 Main St", 1, 2000, 5000));
        assets.add(new House("Vacation Home", "2022-06-15", 250000, "456 Beach Ave", 2, 1500, 3000));
        assets.add(new Vehicle("Tom's Truck", "2018-07-20", 35000, "Ford F-150", 2018, 95000));
        assets.add(new Vehicle("Family Sedan", "2016-03-10", 22000, "Toyota Camry", 2016, 120000));

        for (Asset asset : assets) {
            System.out.printf("%-20s: %s\n", "Description", asset.getDescription());
            System.out.printf("%-20s: %s\n", "Date Acquired", asset.getDateAcquired());
            System.out.printf("%-20s: %s\n", "Original Cost", asset.getOriginalCost());
            System.out.printf("%-20s: %s\n", "Value", asset.getValue());


            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
            }

            System.out.println();
        }
    }
}
