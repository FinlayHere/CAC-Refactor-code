package dto;

import printer.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Statement implements Printer {
    private String customerName;
    private List<Line> lines;
    private Integer totalAmount;
    private Integer volumeCredits;

    public Statement(String customerName, List<Line> lines, Integer totalAmount, Integer volumeCredits) {
        this.customerName = customerName;
        this.lines = lines;
        this.totalAmount = totalAmount;
        this.volumeCredits = volumeCredits;
    }

    public Statement() {
        this.lines = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getVolumeCredits() {
        return volumeCredits;
    }

    public void setVolumeCredits(Integer volumeCredits) {
        this.volumeCredits = volumeCredits;
    }

    @Override
    public String print() {
        return String.format("Statement for %s%n", customerName) +
                lines.stream().map(Line::print).collect(Collectors.joining("")) +
                String.format("Amount owed is %s%n", formatter.format(totalAmount / 100)) +
                String.format("You earned %s credits%n", volumeCredits);
    }
}
