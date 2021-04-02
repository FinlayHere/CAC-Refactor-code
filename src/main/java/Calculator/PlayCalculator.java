package Calculator;

import dto.Performance;

public interface PlayCalculator {
    Integer calculateAmount(Integer theNumberOfAudience);

    default Integer calculateCredit(Integer theNumberOfAudience) {

        return Math.max(theNumberOfAudience - 30, 0);
    }
}
