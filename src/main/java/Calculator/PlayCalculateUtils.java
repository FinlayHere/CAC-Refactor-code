package Calculator;

import dto.Performance;

import java.util.HashMap;
import java.util.Map;

public final class PlayCalculateUtils {
    private PlayCalculateUtils() {

    }

    private static final Map<String, PlayCalculator> PLAY_TYPE_AND_ITS_CALCULATOR = new HashMap<>();

    static {
        PLAY_TYPE_AND_ITS_CALCULATOR.put("tragedy", new TragedyCalculator());
        PLAY_TYPE_AND_ITS_CALCULATOR.put("comedy", new ComedyCalculator());
    }

    public static Integer getAmount(Integer theNumberOfAudience, String playType) {
        if (!PLAY_TYPE_AND_ITS_CALCULATOR.containsKey(playType)) {
            throw new Error(String.format("Unknown type: %s", playType));
        }

        return PLAY_TYPE_AND_ITS_CALCULATOR.get(playType).calculateAmount(theNumberOfAudience);
    }

    public static Integer getCredits(Integer theNumberOfAudience, String playType) {

        return PLAY_TYPE_AND_ITS_CALCULATOR.get(playType).calculateCredit(theNumberOfAudience);
    }

}
