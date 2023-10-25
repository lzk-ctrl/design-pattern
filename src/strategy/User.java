package strategy;

public class User {
    private Strategy strategy;
    public User(Strategy strategy) {
        this.strategy = strategy;
    }
    public void useCopy() {
        strategy.copy();
    }
}
