public class Fib {
    protected long timeToComplete = 0;
    protected int positionInSequence;
    protected int fibNumber;

    public Fib(int positionInSequence) {
        this.positionInSequence = positionInSequence;
    }

    public long getTimeToComplete() {
        return timeToComplete;
    }

    public int getFibNumber() {
        return fibNumber;
    }
}
