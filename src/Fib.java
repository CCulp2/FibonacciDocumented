public class Fib {
    protected long timeToComplete = 0;
    protected int positionInSequence;
    protected int fibNumber;
    FibTestDataPoint dataPoint;

    public Fib(int positionInSequence) {
        this.positionInSequence = positionInSequence;
        this.dataPoint = new FibTestDataPoint();
    }

    public FibTestDataPoint getDataPoint() {
        return dataPoint;
    }
}
