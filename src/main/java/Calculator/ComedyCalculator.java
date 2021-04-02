package Calculator;

import dto.Performance;

public class ComedyCalculator implements PlayCalculator {
    private static final Integer AUDIENCE_THRESHOLD = 20;
    private static final Integer BASE_AMOUNT = 30000;
    private static final Integer BONUS_AMOUNT = 10000;
    private static final Integer FEE_WHEN_AUDIENCE_MORE_THAN_THRESHOLD = 500;
    private static final Integer FEE_WHEN_AUDIENCE_LESS_THAN_THRESHOLD = 300;

    @Override
    public Integer calculateAmount(Integer theNumberOfAudience) {
        return BASE_AMOUNT + FEE_WHEN_AUDIENCE_LESS_THAN_THRESHOLD * theNumberOfAudience
                + (theNumberOfAudience > AUDIENCE_THRESHOLD
                ? BONUS_AMOUNT + FEE_WHEN_AUDIENCE_MORE_THAN_THRESHOLD * (theNumberOfAudience - AUDIENCE_THRESHOLD) : 0);
    }

    @Override
    public Integer calculateCredit(Integer theNumberOfAudience) {
        return Math.max(theNumberOfAudience - 30, 0) + theNumberOfAudience / 5;
    }
}
