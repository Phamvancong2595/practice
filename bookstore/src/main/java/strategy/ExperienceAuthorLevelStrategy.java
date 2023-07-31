package strategy;

import constant.AuthorLevels;

public class ExperienceAuthorLevelStrategy implements AuthorLevelStrategy{
    @Override
    public String getLevelName() {
        return AuthorLevels.EXPERIENCE;
    }

    @Override
    public long getMaxBookCount() {
        return 6;
    }
}
