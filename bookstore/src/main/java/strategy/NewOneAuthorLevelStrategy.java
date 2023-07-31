package strategy;

import constant.AuthorLevels;

public class NewOneAuthorLevelStrategy implements AuthorLevelStrategy{
    @Override
    public String getLevelName() {
        return AuthorLevels.EXPERT;
    }

    @Override
    public long getMaxBookCount() {
        return 3;
    }
}
