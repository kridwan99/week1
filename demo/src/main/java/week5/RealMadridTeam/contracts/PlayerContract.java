// PlayerContract.java
package week5.RealMadridTeam.contracts;

import week5.RealMadridTeam.Player;
import java.time.LocalDate;

public abstract class PlayerContract {
    private LocalDate date;
    private Player player;
    private String destinationClub;

    public PlayerContract(LocalDate date, Player player, String destinationClub) {
        this.date = date;
        this.player = player;
        this.destinationClub = destinationClub;
    }

    public LocalDate getDate() { return date; }
    public Player getPlayer() { return player; }
    public String getDestinationClub() { return destinationClub; }

    public abstract double getTotalFee();
}
