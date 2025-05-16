// TransferContract.java
package week5.RealMadridTeam.contracts;

import week5.RealMadridTeam.Player;
import java.time.LocalDate;

public class TransferContract extends PlayerContract {
    private double transferFee;

    public TransferContract(LocalDate date, Player player, String destinationClub, double transferFee) {
        super(date, player, destinationClub);
        this.transferFee = transferFee;
    }

    public double getTransferFee() {
        return transferFee;
    }

    @Override
    public double getTotalFee() {
        return transferFee;
    }
}
