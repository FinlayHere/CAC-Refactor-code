import Calculator.PlayCalculateUtils;
import dto.*;

import java.util.Map;

public class StatementPrinter {
    public String print(Invoice invoice, Map<String, Play> plays) {
        Statement statement = new Statement();
        int totalCredits = 0;
        int totalAmount = 0;

        for (Performance performance : invoice.getPerformances()) {
            Play play = getPlayBy(performance, plays);
            int amount = PlayCalculateUtils.getAmount(performance.getAudience(), play.getType());
            statement.getLines().add(new Line(play.getName(), amount, performance.getAudience()));

            totalAmount += amount;
            totalCredits += PlayCalculateUtils.getCredits(performance.getAudience(), play.getType());
        }

        statement.setTotalAmount(totalAmount);
        statement.setVolumeCredits(totalCredits);
        statement.setCustomerName(invoice.getCustomer());

        return statement.print();
    }

    private Play getPlayBy(Performance performance, Map<String, Play> plays) {
        return plays.get(performance.getPlayID());
    }
}
