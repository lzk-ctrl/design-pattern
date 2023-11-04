package mediator;

public abstract class Subsystem {
    protected Mediator mediator;
    public Subsystem(Mediator mediator) {
        this.mediator = mediator;
    }
}
