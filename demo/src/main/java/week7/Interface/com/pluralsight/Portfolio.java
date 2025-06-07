package week7.Interface.com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Valuable> assets = new ArrayList<>();

    public void addAsset(Valuable asset) {
        assets.add(asset);
    }

    public void printBreakdown() {
        System.out.println("Portfolio Breakdown: All good");
        double total = 0.0;

        for (Valuable asset : assets) {
            System.out.printf("%-30s = $%.2f%n", asset.toString(), asset.getValue());
            total += asset.getValue();
        }

        System.out.println("----------------------------------------");
        System.out.printf("TOTAL NET WORTH                 = $%.2f%n", total);
    }
}
