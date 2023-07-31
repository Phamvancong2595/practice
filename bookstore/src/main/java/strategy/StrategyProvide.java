package strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyProvide {
    private final Map<Class<?>, Object> strategyByType;
    public StrategyProvide() {
        strategyByType = new HashMap<>();
        strategyByType.put(AuthorLevelStrategyContext.class, new AuthorLevelStrategyContext());
    }
    @SuppressWarnings("unchecked")
    public <S> S getTrategy(Class<S> strategyClass) {
        return (S) strategyByType.get(strategyClass);
    }
}
