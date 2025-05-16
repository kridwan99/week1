// ContractFileManager.java
package week5.RealMadridTeam.contracts;

import week5.RealMadridTeam.Player;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {
    private static final String CONTRACT_FILE = "player_contracts.csv";

    public void saveContract(PlayerContract contract) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONTRACT_FILE, true))) {
            Player p = contract.getPlayer();
            StringBuilder sb = new StringBuilder();

            if (contract instanceof TransferContract tc) {
                sb.append("TRANSFER").append("|")
                        .append(contract.getDate()).append("|")
                        .append(p.getId()).append("|")
                        .append(p.getName()).append("|")
                        .append(contract.getDestinationClub()).append("|")
                        .append(tc.getTransferFee()).append("|")
                        .append(tc.getTotalFee());
            } else if (contract instanceof LoanContract lc) {
                sb.append("LOAN").append("|")
                        .append(contract.getDate()).append("|")
                        .append(p.getId()).append("|")
                        .append(p.getName()).append("|")
                        .append(contract.getDestinationClub()).append("|")
                        .append(lc.getDurationMonths()).append("|")
                        .append(lc.getLoanFee()).append("|")
                        .append(lc.getOptionalBuyFee()).append("|")
                        .append(lc.getTotalFee());
            }

            String line = sb.toString();
            System.out.println("Writing contract line: " + line);  // Debug print

            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Failed to save contract: " + e.getMessage());
        }
    }

}
