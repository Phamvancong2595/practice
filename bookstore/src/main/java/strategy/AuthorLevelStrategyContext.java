package strategy;

import constant.AuthorLevels;

import java.util.Arrays;
import java.util.*;
public class AuthorLevelStrategyContext {
    private final List<AuthorLevelStrategy> authorLevelStrategies = Arrays.asList(
            new NewOneAuthorLevelStrategy(),
            new ExperienceAuthorLevelStrategy(),
            new ExpertAuthorLevelStrategy()
    );
    public String decideAuthorLevel(long bookCount) {
        String level = AuthorLevels.NEW_ONE;
        for (AuthorLevelStrategy strategy: authorLevelStrategies) {
            if (bookCount <= strategy.getMaxBookCount()) {
                level = strategy.getLevelName();
                break;
            }
        }
        return level;
    }
}
