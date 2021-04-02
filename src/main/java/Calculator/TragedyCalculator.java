package Calculator;

public class TragedyCalculator implements PlayCalculator {
    private static final Integer AUDIENCE_THRESHOLD = 30;
    private static final Integer BASE_AMOUNT = 40000;
    private static final Integer FEE_WHEN_AUDIENCE_MORE_THAN_THRESHOLD = 1000;

    @Override
    public Integer calculateAmount(Integer theNumberOfAudience) {
        return theNumberOfAudience > AUDIENCE_THRESHOLD
                ? BASE_AMOUNT + FEE_WHEN_AUDIENCE_MORE_THAN_THRESHOLD * (theNumberOfAudience - AUDIENCE_THRESHOLD)
                : BASE_AMOUNT;
    }
}
