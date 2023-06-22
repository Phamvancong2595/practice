package designpattern.singleton.v1;

public class Sum {
    public int sum(int a, int b) {
        final int result = a + b;
        final SumStorage sumStorage = new SumStorage();
        sumStorage.store(result);
        return result;
    }
}
